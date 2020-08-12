package bean.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String []a){
		Resource res = new ClassPathResource("bean/example/beanContext.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(res);
		
		Student s1 = (Student) beanFactory.getBean("std1");
		
		System.out.println(s1);
	}
}
