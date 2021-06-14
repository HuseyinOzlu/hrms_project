package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrates.City;

public interface CityDao extends JpaRepository<City, Integer> {
//	List<City> getAll(); 
}
