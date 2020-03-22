package com.huafanfan.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huafanfan.pojo.Airport;
import com.huafanfan.service.impl.AirportServiceImpl;

public class Test {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext 默认去classes文件夹根目录开始寻找
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		String[] names = ac.getBeanDefinitionNames();
//		for (String string : names) {
//			System.out.println(string);
//		}
		AirportServiceImpl bean = ac.getBean("airportService",AirportServiceImpl.class);
		List<Airport> list = bean.show();
		System.out.println(list);
	}
}
