package com.gzechett.animal.base;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService 
{
	@Autowired
	private AnimalRepository repo;
	
	public List<Animal> listAll()
	{
		return (List<Animal>) repo.findAll();
	}
	
	public void save(Animal animal)
	{
		repo.save(animal);
	}
	
	public Animal get(String name)
	{
		Optional<Animal> result =  repo.findById(name);
		return result.get();
	}
	
	public void delete(String name)
	{
		repo.deleteById(name);
	}
	
	public List<Animal> search(String keyword)
	{
		return repo.search(keyword);
	}
}