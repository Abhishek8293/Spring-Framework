package com.spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class PersonEntity {

	@Value("1")
	private int personId;

	@Value("John Doe")
	private String personName;

	@Value("#{banklist}")
	private List<String> accounts;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonNameString() {
		return personName;
	}

	public void setPersonNameString(String personNameString) {
		this.personName = personNameString;
	}

	public List<String> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}

	public PersonEntity(int personId, String personNameString, List<String> accounts) {
		super();
		this.personId = personId;
		this.personName = personNameString;
		this.accounts = accounts;
	}

	public PersonEntity() {
		super();
	}

	@Override
	public String toString() {
		return "PersonEntity [personId=" + personId + ", personName=" + personName + ", accounts="
				+ accounts + "]";
	}

}
