package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrates.WorkFeature;

public interface WorkFeatureDao extends JpaRepository<WorkFeature, Integer> {

}
