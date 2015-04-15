package com.doctor.spring4.blog.code.observer_pattern_with_spring_events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.doctor.spring4.blog.code.observer_pattern_with_spring_events.EventSource.MessageEvent;

@Component
public class ResponseHandler implements ApplicationListener<MessageEvent> {

	@Override
	public void onApplicationEvent(MessageEvent event) {
		System.out.println(Thread.currentThread().getName() + " : " + event);

	}

}
