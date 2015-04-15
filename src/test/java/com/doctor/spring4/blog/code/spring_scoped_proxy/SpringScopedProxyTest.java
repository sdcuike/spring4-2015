package com.doctor.spring4.blog.code.spring_scoped_proxy;

import static org.junit.Assert.*;
import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.core.IsNot.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * How a prototype scoped bean is injected into a Singleton scoped bean.
 * 
 * @see http://www.javacodegeeks.com/2012/08/spring-scoped-proxy.html
 * @author doctor
 *
 * @time 2015年4月15日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringScopedProxyConfig.class })
public class SpringScopedProxyTest {
	@Resource
	private SingletonScopedBean singletonScopedBean;

	@Test
	public void test() {
		assertThat(singletonScopedBean.getState(), not(equalTo(singletonScopedBean.getState())));
	}

}
