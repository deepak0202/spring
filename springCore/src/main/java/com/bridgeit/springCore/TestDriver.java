package com.bridgeit.springCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestDriver 
{
	public static void main(String[] args) 
	{
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Testpojo test = (Testpojo) beanFactory.getBean("t");
		Testpojo test1 = (Testpojo) beanFactory.getBean("t");
		Testpojo test2 = (Testpojo) beanFactory.getBean("t");
		
		//by default they are singleton in nature 
		// but if we make scope = prototype then singlton nature will drop
		
		
		test.hello();
		
	}

}
