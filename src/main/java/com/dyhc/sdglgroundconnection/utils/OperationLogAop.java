package com.dyhc.sdglgroundconnection.utils;

import com.dyhc.sdglgroundconnection.annotation.RecordOperation;
import com.dyhc.sdglgroundconnection.pojo.Operationlog;
import com.dyhc.sdglgroundconnection.pojo.Staff;
import com.dyhc.sdglgroundconnection.service.OperationlogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 操作日志切面类（wuyongfei）
 **/
@Component
@Aspect
public class OperationLogAop {

    @Autowired
    private OperationlogService operationlogService;

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(OperationLogAop.class);

    /**
     * 配置切入点（wuyongfei）
     */
    @Pointcut("@annotation(com.dyhc.sdglgroundconnection.annotation.RecordOperation)")
    public void executeOperationLog() {
    }

    /**
     * 在每一个方法正常执行完成后添加操作的日志信息到数据库（wuyongfei）
     */
    @AfterReturning("executeOperationLog()")
    public void addOperationLog(JoinPoint joinPoint) {
        //获取request请求
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = attr.getRequest();
        // 获取目标注解
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        // 获取目标类名
        String className = signature.getDeclaringTypeName();
        // 获取目标方法名
        String methodName = method.getName();
        // 获取注解描述信息
        RecordOperation recordOperation = method.getAnnotation(RecordOperation.class);
        // 操作类型
        String type = recordOperation.type();
        // 操作内容
        String desc = recordOperation.desc();
        // 当前系统时间
        Date date = new Date();
        // 获取当前用户
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            Staff staff = new Staff();
            staff.setRoleId(1);
            staff.setStaffId(1);
            session.setAttribute("user", staff);
        }
        // 填充对象
        Staff user = (Staff) session.getAttribute("user");
        Operationlog operationlog = new Operationlog();
        operationlog.setOperationContent(desc);
        operationlog.setCreateDate(date);
        operationlog.setCreateBy(user.getStaffId());
        operationlog.setOperationDate(date);
        operationlog.setStatus(0);
        operationlog.setRoleId(user.getRoleId());
        operationlog.setOperationType(type);
        // 执行添加日志
        try {
            operationlogService.addOperationLog(operationlog);
            logger.debug(" aspect: 目标类：" + className + " 目标方法：" + methodName +
                    " 操作编号：" + user.getStaffId() + " 操作类型：" + type + " 操作内容：" + desc + "  添加日志成功！");
        } catch (Exception e) {
            logger.error(" aspect: 目标类：" + className + " 目标方法：" + methodName +
                    " 操作编号：" + user.getStaffId() + " 操作类型：" + type + " 操作内容：" + desc + "  添加日志失败！");
            e.printStackTrace();
        }
    }
}
