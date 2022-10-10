package com.example.example.TongGiaHuy_420300154901.Nhom1.cau1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cusId")
	private String cusID;
	@Column(name = "name")
	private String name;
	@Column(name ="year_of_birth")
	private int yearOfBirth;
	public String getCusID() {
		return cusID;
	}
	public void setCusID(String cusID) {
		this.cusID = cusID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public Customer(String cusID, String name, int yearOfBirth) {
		super();
		this.cusID = cusID;
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [cusID=" + cusID + ", name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
	}
	
	
}
