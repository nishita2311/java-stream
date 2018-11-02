package com.accenture.lkm.io.objectstream;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Person implements Serializable {

	private static final long serialVersionUID = 3040037688942134461L;
	private int id;
	private String name;
	private String email;
//	private transient int age;
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
