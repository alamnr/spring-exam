package com.spring.professional.exam.tutorial.module01.question31.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

	@Value("${app.file.property}")
	public String appFileProperty;
	
	@Value("${app.vm.property}")
	public String appVmProperty;
	
	@Value("${app.env.property}")
	public String appEnvProperty;
	
	@Value("${user.home}")
	public String userHome;
	
	@Value("${JAVA_HOME}")
	public String javaHome;
	
	@Value("${MAVEN_HOME}")
	public String mavenHome;

	public String getAppFileProperty() {
		return appFileProperty;
	}

	public String getAppVmProperty() {
		return appVmProperty;
	}

	public String getAppEnvProperty() {
		return appEnvProperty;
	}

	public String getUserHome() {
		return userHome;
	}

	public String getJavaHome() {
		return javaHome;
	}

	public String getMavenHome() {
		return mavenHome;
	}

	@Override
	public String toString() {
		return "SpringBean [appFileProperty=" + appFileProperty + ", appVmProperty=" + appVmProperty
				+ ", appEnvProperty=" + appEnvProperty + ", userHome=" + userHome + ", javaHome=" + javaHome
				+ ", mavenHome=" + mavenHome + "]";
	}
	
	
}
