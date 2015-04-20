package com.doctor.spring4.blog.code.spring_rofiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * introduction-to-spring-profiles
 * 
 * @see http://www.javacodegeeks.com/2015/03/introduction-to-spring-profiles.html
 * 
 * @author doctor
 *
 * @time 2015年4月20日 上午8:42:02
 */
public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("saml");
		context.scan("com.doctor.spring4.blog.code.spring_rofiles");
		context.refresh();
		Authentication authentication = context.getBean(Authentication.class);
		authentication.printInfo();
		context.close();

	}

}
