package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrates.Jobs;

public interface JobsDao extends JpaRepository<Jobs, Integer> {

}
