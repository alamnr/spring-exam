package com.spring.professional.exam.tutorial.module01.question29.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

	@Value("John")
	private String name;
	
	@Value("#{'Wall Street'.toUpperCase()}")
	private String streetName;
	
	@Value("true")
	private boolean accountExist;
	
	@Value("100")
	private int idNumber;
	
	@Value("#{5000*0.9}")
	private float accountBalance;
	
	@Value("${app.department.id}")
	private int departmentId;
	
	@Value("#{'${app.department.name}'.toUpperCase()}")
	private String departmentName;
	
	private String managerName;
	
	private String supportContactMail;
	
	private String supportPhone;
	
	private String supportAddress;
	
	@Value("${app.dependent.departments}")
	private String[] dependentDepartments;
	
	@Value("${app.cases.id}")
	private List<Integer> casesIds;
	
	@Value("${app.cases.set}")
	private Set<String> casesSet;
	
	@Value("#{${app.cases.map}}")
	private Map<String,Integer> casesMap;
	
	@Value("#{springBean2.taxId}")
	private int taxtId;
	
	public SpringBean1(@Value("#{'${app.manager.name}'.toUpperCase()}") String managerName) {
		this.managerName = managerName;
	}

	@Value("${app.support.contact}")
	public void setSupportContactMail(String supportContactMail) {
		this.supportContactMail = supportContactMail;
	}
	
	@Autowired
	public void setSupportPhoneAndAddress(@Value("${app.support.phone}") String supportPhone,
			@Value("${app.support.address}") String supportAddress) {
		this.supportPhone = supportPhone;
		this.supportAddress = supportAddress;
	}

	public String getName() {
		return name;
	}

	public String getStreetName() {
		return streetName;
	}

	public boolean isAccountExist() {
		return accountExist;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public String getManagerName() {
		return managerName;
	}

	public String getSupportContactMail() {
		return supportContactMail;
	}

	public String getSupportPhone() {
		return supportPhone;
	}

	public String getSupportAddress() {
		return supportAddress;
	}

	public String[] getDependentDepartments() {
		return dependentDepartments;
	}

	public List<Integer> getCasesIds() {
		return casesIds;
	}

	public Set<String> getCasesSet() {
		return casesSet;
	}

	public Map<String, Integer> getCasesMap() {
		return casesMap;
	}

	@Override
	public String toString() {
		return "SpringBean [name=" + name + ", streetName=" + streetName + ", accountExist=" + accountExist
				+ ", idNumber=" + idNumber + ", accountBalance=" + accountBalance + ", departmentId=" + departmentId
				+ ", departmentName=" + departmentName + ", managerName=" + managerName + ", supportContactMail="
				+ supportContactMail + ", supportPhone=" + supportPhone + ", supportAddress=" + supportAddress
				+ ", dependentDepartments=" + Arrays.toString(dependentDepartments) + ", casesIds=" + casesIds
				+ ", casesSet=" + casesSet + ", casesMap=" + casesMap + "]";
	}
	
	
	
}
