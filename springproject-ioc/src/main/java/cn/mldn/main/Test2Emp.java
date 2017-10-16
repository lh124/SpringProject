package cn.mldn.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.message.IMessage;
import cn.mldn.vo.Emp;

public class Test2Emp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/spring-ioc.xml");
		Emp emp =applicationContext.getBean("Emp", Emp.class);
		System.out.println(emp);
	}
}
