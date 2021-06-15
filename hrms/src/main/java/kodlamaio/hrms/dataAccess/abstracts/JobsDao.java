package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrates.Jobs;

public interface JobsDao extends JpaRepository<Jobs, Integer> {
	List<Jobs> getByIsJobOpenTrue();

	List<Jobs> getByIsJobOpenTrueAndEmployers_CompanyName(String companyName); 

	List<Jobs> getByIsJobOpenTrueAndDateLessThanEqual(int date); 
}	
