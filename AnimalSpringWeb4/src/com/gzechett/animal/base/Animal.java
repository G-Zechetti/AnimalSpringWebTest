package com.gzechett.animal.base;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Animals")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name = "Species")
public abstract class Animal 
{
	protected int age;
	protected String name;
	protected int hunger;
	protected boolean hungry = true;

	//Getters
	@Column(name = "Age")
	public int getAge() {
		return age;
	}
	
	@Id
	@Column(name = "Name")
	public String getName() {
		return name;
	}
	
	@Column(name = "Hunger")
	public int getHunger() {
		return hunger;
	}

	//Setters
	public void setAge(final int age) {
		this.age = age;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public void setHunger(final int hunger) {
		this.hunger = hunger;
	}
}