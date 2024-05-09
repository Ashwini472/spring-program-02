package in.sp.resouces;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.bean.student;

@Configuration
public class springconfigjava {

	@Bean
	public student std1()
	{
		student std= new student ();
		std.setRoll(101);
		std.setName("ashwini");
		std.setEmail("ashwini@gmail.com");
		
		return std;
		
	}
	
	
	@Bean
	public student std2()
	{
		student std= new student ();
		std.setRoll(102);
		std.setName("shwini");
		std.setEmail("shwini@gmail.com");
		
		return std;
		
	}

	@Bean("bean_name")
	public student classname()
	{
		student std= new student ();
		std.setRoll(102);
		std.setName("shwini");
		std.setEmail("shwini@gmail.com");
		
		return std;
		
	}
}
