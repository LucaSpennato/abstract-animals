package org.javaoop.abs;

import java.time.LocalDate;
import java.util.Random;

public abstract class Person {

	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String corporateCode;
	
	public Person(String name, String surname) {
		
		setName(name);
		setSurname(surname);
		setDateOfBirth();
		setCorporateCode();
		
	}
	
	private void setCorporateCode() {
		Random rnd = new Random();
		corporateCode = rnd.nextInt(99999999) + "";
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	private void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	private void setDateOfBirth() {
		this.dateOfBirth = LocalDate.now();
	}

	public String getCorporateCode() {
		return corporateCode;
	}
	
	public String getFullName() {
		return getName() + " " + getSurname() + " (code: " + getCorporateCode() + ")";
	}
	
	public abstract int getYearIncome();
	
	@Override
	public String toString() {

		return "\nFull name: " + getFullName()
				+ "\nDate of birth: " + getDateOfBirth()
				+ "\nYear income: " + getYearIncome() + "$";
	}
}
