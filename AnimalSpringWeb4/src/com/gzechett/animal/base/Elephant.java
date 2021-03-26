package com.gzechett.animal.base;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("Elephant")
public final class Elephant extends Animal
{
	public Elephant() 
	{
		this.hunger = 800;
	}
	public Elephant(final String name, final int age)
	{
		this.name = name;
		this.age = age;
		this.hunger = 800;
	}
}
