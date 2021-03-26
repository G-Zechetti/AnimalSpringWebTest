package com.gzechett.animal.base;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("Lion")
public final class Lion extends Animal
{	
	public Lion () 
	{
		this.hunger = 50;
	}
	
	public Lion(final String name, final int age)
	{
		this.name = name;
		this.age = age;
		this.hunger = 50;
	}
}
