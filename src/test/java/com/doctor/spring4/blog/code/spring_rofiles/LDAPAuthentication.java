package com.doctor.spring4.blog.code.spring_rofiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("ldap")
public class LDAPAuthentication implements Authentication {

	@Override
	public void printInfo() {
		System.out.println("LDAPAuthentication");

	}

}
