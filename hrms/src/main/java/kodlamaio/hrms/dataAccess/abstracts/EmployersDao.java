package kodlamaio.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrates.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer> {

}
