package com.tyrowebdev.E_Bank.model;

public class Users {

	private int id;
	private String name;
	private String email;
	private String password;
	private String address;
	private String contact;
	private String balance;
	
	
	
	public Users(String name, String email, String password, String address, String contact) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.contact = contact;
	}
	public Users(int id, String name, String email, String password, String address, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.contact = contact;
	}
	public Users(int id, String name, String email, String address, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.contact = contact;
	}
	public Users(String name, String email, String address, String contact) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.contact = contact;
	}
	public Users(String name, String email, String password, String address, String contact, String balance) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.contact = contact;
		this.balance = balance;
	}
	public Users(int id, String name, String email, String password, String address, String contact, String balance) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.contact = contact;
		this.balance = balance;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		 this.balance = balance;
	}
	
	
	
}
