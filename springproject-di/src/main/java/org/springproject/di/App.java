package org.springproject.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.vo.Dept;

/**
 * Hello world!
 *
 */

public class App {
	public static void main( String[] args ){
		
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring/spring-di.xml");
		Dept dept =applicationContext.getBean("dept",Dept.class);
		System.out.println(dept);
		System.out.println(dept.getInfo());
		System.out.println(dept.getSetinfo());
	}
}
