package com.spring.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private int number;

	private String address;

	private String phone;

	public player() {
	}

	public player(int id, String name, int number, String address, String phone) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.address = address;
		this.phone = phone;
	}

	public player(String name, int number, String address, String phone) {
		this.name = name;
		this.number = number;
		this.address = address;
		this.phone = phone;
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
