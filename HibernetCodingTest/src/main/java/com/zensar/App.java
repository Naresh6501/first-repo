package com.zensar;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import com.zensar.util.Hibernate;
import com.zensar.util.JPAUtil;

import com.zensar.bean.Employee;
import com.zensar.bean.Address;
import com.zensar.bean.BankAccount;
import com.zensar.bean.Skill;




public class App 
{
	public static void loadTesting() {
		//code here to load employee object
	}
	public static void insertTesting() {
		//code to persist employee object
	
        EntityManager em=JPAUtil.createEntityManager("PU");
		 Employee employee=new Employee( "kumar", 1600000.00, null,null,null);
	        
	        Address address=new Address( "hyd", "500092",null);
	        BankAccount account=new  BankAccount(101,"hdfc001");
	        employee.addSkill(new Skill("Spring",3));
	        
	        
	       
	        em.getTransaction().begin();
	        em.persist(employee);
	        
	        em.getTransaction().commit();
	        JPAUtil.shutDown();
	        Hibernate.cleanUp();
	        
		System.out.println("\t\t"+"------data saved-----"+"\t\t");
	}
    public static void main( String[] args )
    {
    	insertTesting();
    }
}
