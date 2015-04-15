package com.doctor.spring4.blog.code.observer_pattern_with_spring_events;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Observer Pattern with Spring Events
 * 
 * @see http://www.javacodegeeks.com/2012/08/observer-pattern-with-spring-events.html
 * @author doctor
 *
 * @time 2015年4月15日
 */
public class ObserverPatternWithSpringEvents {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ObserverPatternWithSpringEventsConfig.class);
		EventSource eventSource = context.getBean(EventSource.class);
		new Thread(eventSource).start();
	}

	@Configuration
	@ComponentScan(basePackages = "com.doctor.spring4.blog.code.observer_pattern_with_spring_events")
	public static class ObserverPatternWithSpringEventsConfig {

	}

}
