package kodlamaio.hrms.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnemployedWithCvDto {
	
	private int id;
	private String firstName;
	private String school;
	private String departmant;
	private int firstYearSchool;
	private int graduationYear;
	private String lastJobsName;
	private String lastJobsPosition;
	private int jobsEnterYear;
	private int jobsEndYear;
	private String[] languages;
	private int languagesLevel;	
	private String github;
	private String linkedIn;
	private String[] softwareLangOrTech;
	private String fronTitle;
	
}


