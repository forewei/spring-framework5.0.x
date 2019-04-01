package com.forewei.spring;

import com.forewei.dao.AppUserDao;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author forewei
 * @date 2019-3-27 16:09
 */
public class ForeweiBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// 扫描
		// for
		BeanDefinitionBuilder bd = BeanDefinitionBuilder.genericBeanDefinition(AppUserDao.class);
		GenericBeanDefinition genericBeanDefinition =(GenericBeanDefinition) bd.getBeanDefinition();
		genericBeanDefinition.getConstructorArgumentValues().addGenericArgumentValue(AppUserDao.class);
		genericBeanDefinition.setBeanClass(ForeweiFactoryBean.class);
		registry.registerBeanDefinition("appUserDao",genericBeanDefinition);
//		appUserDao.r
	}
}
