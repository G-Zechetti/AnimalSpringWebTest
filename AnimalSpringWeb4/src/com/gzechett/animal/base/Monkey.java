package com.gzechett.animal.base;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("Monkey")
public final class Monkey extends Animal 
{
	public Monkey() 
	{
		this.hunger = 12;
	}
	
	public Monkey(final String name, final int age)
	{
		this.name = name;
		this.age = age;
		this.hunger = 12;
	}
}
