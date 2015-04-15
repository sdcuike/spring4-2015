package com.doctor.spring4.blog.code.spring_scoped_proxy;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/**
 * 
 * @author doctor
 *
 * @time 2015年4月15日
 */
@Component
public class SingletonScopedBean {

	@Resource
	private PrototypeScopedBean prototypeScopedBean;

	public String getState() {
		return prototypeScopedBean.getState();
	}
}
