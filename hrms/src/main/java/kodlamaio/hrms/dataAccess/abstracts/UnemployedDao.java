package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrates.Unemployed;

public interface UnemployedDao extends JpaRepository<Unemployed, Integer> {

}
