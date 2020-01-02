package com.altimetrik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationContextDemo {

	public static void main(String[] args) {
		ApplicationContext apContext=new FileSystemXmlApplicationContext("D:/Users/nmehta6812/Downloads/STS-Boot/WSpace-2/Spring-Annotation-core/src/com/altimetrik/beans.xml");
		User user=apContext.getBean("user", User.class);
		user.printData();

	}

}
