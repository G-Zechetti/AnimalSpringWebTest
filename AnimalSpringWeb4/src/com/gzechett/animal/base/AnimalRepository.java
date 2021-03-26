package com.gzechett.animal.base;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AnimalRepository extends CrudRepository<Animal, String> 
{
	@Query(value = "SELECT c FROM Animal c WHERE c.name LIKE '%' || :keyword || '%'" + 
					"OR c.age LIKE '%' || :keyword || '%'" + 
					"OR c.hunger LIKE '%' || :keyword || '%'")	
	public List<Animal> search(@Param("keyword") String keyword);
}
