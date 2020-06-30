package org.ali;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	//@Override
	public Object postProcessAfterInitialization(Object arg,String arg1) throws BeansException {
		System.out.println("After Initialization , bean name is:" +arg1);
	return arg;
	}
	public Object postProcessBeforeInitialization(Object arg,String arg1) throws BeansException {
		System.out.println("Before Initialization , bean name is:" +arg1);
	return arg;
	}
}
