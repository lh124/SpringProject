package cn.mldn.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.message.IMessage;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/spring-ioc.xml");
		IMessage iMessage =applicationContext.getBean("messageImpl", IMessage.class);
		System.out.println(iMessage.echo("Hello World"));
	}
}
