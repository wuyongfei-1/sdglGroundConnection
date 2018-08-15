package com.dyhc.sdglgroundconnection.annotation;

import java.lang.annotation.*;

/**
 * 记录操作注解（wuyongfei）
 */
@Target(ElementType.METHOD) // 方法级别的注解
@Retention(RetentionPolicy.RUNTIME)  // 保留时间的长短（源文件，类文件，运行时）
@Documented // 可以被使用在被注释的元素上
public @interface RecordOperation {
    String type() default "";  // 操作类型

    String desc() default "";  // 操作内容


}
