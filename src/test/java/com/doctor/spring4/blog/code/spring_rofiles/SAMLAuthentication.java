package com.doctor.spring4.blog.code.spring_rofiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("saml")
public class SAMLAuthentication implements Authentication {

	@Override
	public void printInfo() {
		System.out.println("SAMLAuthentication");

	}

}
