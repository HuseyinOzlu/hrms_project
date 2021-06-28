package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concrates.Cv;
import kodlamaio.hrms.entities.dtos.UnemployedWithCvDto;

public interface CvDao extends JpaRepository<Cv, Integer> {
	@Query("Select new kodlamaio.hrms.entities.dtos.UnemployedWithCvDto"
			+ "(u.id, u.firstName, c.school, c.departmant, c.firstYearSchool, "
			+ "c.graduationYear, c.lastJobsName, c.lastJobsPosition, c.jobsEnterYear,"
			+ " c.jobsEndYear, c.languages, c.languagesLevel, c.github,"
			+ " c.linkedIn, c.softwareLangOrTech, c.frontTitle) "
			+"From Cv c Inner Join c.unemployeds u")
	List<UnemployedWithCvDto> getUnemployedWithCvDetails();
}
