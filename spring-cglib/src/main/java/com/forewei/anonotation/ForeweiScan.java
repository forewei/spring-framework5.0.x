package com.forewei.anonotation;

import com.forewei.spring.ForeweiBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author forewei
 * @date 2019-3-27 15:22
 */
// 生命周期
@Retention(RetentionPolicy.RUNTIME)
// 作用类型
@Target({ElementType.TYPE})
@Import(ForeweiBeanDefinitionRegistrar.class)
public @interface ForeweiScan {
}
