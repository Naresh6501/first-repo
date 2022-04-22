package com.zensar.bean;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity

public class Employee {
	@Id
	
int employeeId;
@Column
String name;
@Column
double basicSalary;
//@OneToMany(cascade = CascadeType.ALL)
//	 @JoinTable(name="employee1_address1",
//			 joinColumns=@JoinColumn(name="employee_Id",referencedColumnName ="employeeId" ),inverseJoinColumns = 
//					 @JoinColumn(name="address_Id",referencedColumnName ="addressId" ,unique=true))
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="address_Id",referencedColumnName="addressId")
Address address;

Set<Skill> skillList;
BankAccount account;
//@OneToMany(cascade = CascadeType.ALL)


private void init() {
	if(this.skillList==null)
		this.skillList=new HashSet<Skill>();
}
@Column(name="employeeId")
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBasicSalary() {
	return basicSalary;
}
public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public Set<Skill> getSkillList() {
	return skillList;
}
public void setSkillList(Set<Skill> skillList) {
	this.skillList = skillList;
}
public BankAccount getAccount() {
	return account;
}
public void setAccount(BankAccount account) {
	this.account = account;
}
public Employee(int employeeId, String name, double basicSalary, Address address, Set<Skill> skillList,
		BankAccount account) {
	super();
	this.employeeId = employeeId;
	this.name = name;
	this.basicSalary = basicSalary;
	this.address = address;
	this.skillList = skillList;
	this.account = account;
	init();
}
public Employee(String name, double basicSalary, Address address, Set<Skill> skillList, BankAccount account) {
	super();
	this.name = name;
	this.basicSalary = basicSalary;
	this.address = address;
	this.skillList = skillList;
	this.account = account;
	init();
}
public Employee() {
	super();
	init();
}
//add skill
public boolean addSkill(Skill skill) {
	return this.skillList.add(skill);
}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", name=" + name + ", basicSalary=" + basicSalary + ", address="
			+ address + ", skillList=" + skillList + ", account=" + account + "]";
}


}
