package com.doctor.spring4.blog.code.observer_pattern_with_spring_events;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class EventSource implements ApplicationEventPublisherAware, Runnable {
	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	@Override
	public void run() {
		try {
			while (true) {
				TimeUnit.SECONDS.sleep(3);
				applicationEventPublisher.publishEvent(new MessageEvent(this, UUID.randomUUID().toString()));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static class MessageEvent extends ApplicationEvent {
		private String message;

		public MessageEvent(Object source, String message) {
			super(source);
			this.message = message;

		}

		@Override
		public String toString() {
			return "MessageEvent [message=" + message + "]";
		}

	}
}
