package com.doctor.spring4.blog.code.spring_scoped_proxy;

import java.util.UUID;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * How a prototype scoped bean is injected into a Singleton scoped bean.
 * 
 * use:proxyMode = ScopedProxyMode.TARGET_CLASS
 * 
 * @author doctor
 *
 * @time 2015年4月15日
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PrototypeScopedBean {
	private final String state;

	public PrototypeScopedBean() {
		this.state = UUID.randomUUID().toString();
	}

	public String getState() {
		return state;
	}

}
