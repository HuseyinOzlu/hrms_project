package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrates.HrmsPersonel;

public interface HrmsPersonelDao extends JpaRepository<HrmsPersonel, Integer>{

}
