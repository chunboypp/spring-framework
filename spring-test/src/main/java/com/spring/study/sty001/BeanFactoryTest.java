package com.spring.study.sty001;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryTest {


	public static void main(String[] args){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean testBean = (MyTestBean) bf.getBean("myTestBean");
        System.out.println(testBean.getTestStr());

		Resource resource=new ClassPathResource("beanFactoryTest.xml");
		BeanFactory factory=new DefaultListableBeanFactory();
		BeanDefinitionReader bdr=new XmlBeanDefinitionReader((BeanDefinitionRegistry) factory);
		bdr.loadBeanDefinitions(resource);
//		MyTestBean testBean = (MyTestBean) factory.getBean("beanClass");
//		System.out.println(testBean.getTestStr());
	}

    public void testSimpleLoad(){

//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
//        MyTestBean testBean = (MyTestBean) bf.getBean("myTestBean");
//        System.out.println(testBean.getTestStr());


    }
}
