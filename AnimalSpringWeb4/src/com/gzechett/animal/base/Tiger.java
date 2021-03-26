package com.gzechett.animal.base;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("Tiger")
public final class Tiger extends Animal 
{
	public Tiger () 
	{
		this.hunger = 25;
	}
	public Tiger(final String name, final int age)
	{
		this.name = name;
		this.age = age;
		this.hunger = 25;
	}
}
