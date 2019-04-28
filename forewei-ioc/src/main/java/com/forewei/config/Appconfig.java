package com.forewei.config;

import com.sun.jmx.remote.util.OrderClassLoaders;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;

/**
 * @Author forewei
 * @date 2019-4-2 16:03
 */
@Configuration
@ComponentScan("com.forewei")
//@ImportResource("classpath:\\spring-mix.xml")
public class Appconfig {

}
