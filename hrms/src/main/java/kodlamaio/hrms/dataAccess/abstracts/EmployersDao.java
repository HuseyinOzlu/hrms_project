package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrates.Employers;
import kodlamaio.hrms.entities.concrates.Jobs;

public interface EmployersDao extends JpaRepository<Employers, Integer> {
	Employers getByEmployersName(String employerName);
	
	Employers getByEmployersNameAndJobs_JobsId(String employerName, int jobId);
	
	List<Jobs> getByJobs_JobsInAndJobs_JobsName(List<Integer> jobs, String name);
	
	List<Employers> getByEmployersIdAndEmployersName(int id, String Name);
	
	List<Employers> getByEmployersNameAndJobs_JobsIdAndJobs_Jobs_Name
	(String name, int jobsId, String jobsName);
	
	
}
