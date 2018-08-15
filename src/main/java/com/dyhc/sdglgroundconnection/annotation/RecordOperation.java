package com.dyhc.sdglgroundconnection.annotation;

import java.lang.annotation.*;

/**
 * 记录操作注解（wuyongfei）
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RecordOperation {
    String type() default "";  // 操作类型

    String desc() default "";  // 操作内容


}
