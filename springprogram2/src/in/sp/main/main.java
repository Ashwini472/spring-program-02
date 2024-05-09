package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.bean.student;
import in.sp.resouces.springconfigjava;

public class main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(springconfigjava.class);
		student std = (student) context.getBean("std1");
		std.display();
		System.out.println("-------------------------------");
		ApplicationContext context1 = new AnnotationConfigApplicationContext(springconfigjava.class);
		student std1 = (student) context.getBean("std2");
		std.display();
		System.out.println("-------------------------------");
		
		student std3=(student) context.getBean("bean_name");
		std3.display();
	}

}
