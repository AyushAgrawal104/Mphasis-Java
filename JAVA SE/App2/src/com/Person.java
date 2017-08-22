package com;

public class Person {
	
	public Person() {
	System.out.println("Object created "+this.hashCode());
	}

	private int personId;
	private String personName;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

}
