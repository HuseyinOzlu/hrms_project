package kodlamaio.hrms.entities.concrates;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="cv")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","unemployeds"})
public class Cv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_id")
	private int cvId;
	
	@Column(name="candidates_name")
	private String unEmployedName;
	
	@Column(name="school")
	private String school;
	
	@Column(name="department")
	private String departmant;
	
	@Column(name="first_year")
	private int firstYearSchool;
	
	@Column(name="graduation_year")
	private int graduationYear;
	
	@Column(name="last_jobs_name")
	private String lastJobsName;
	
	@Column(name="last_jobs_position")
	private String lastJobsPosition;
	
	@Column(name="jobs_enter_year")
	private int jobsEnterYear;
	
	@Column(name="jobs_end_year")
	private int jobsEndYear;
	
	@Column(name="languages")
	private String[] languages;
	
	@Column(name="languages_level")
	private int languagesLevel;
	
	@Column(name="github_link")	
	private String github;
	
	@Column(name="linkedln_link")
	private String linkedIn;
	
	@Column(name="softwarelang_or_tech")
	private String[] softwareLangOrTech; 
	
	@Column(name="front_title")
	private String frontTitle;
	
	
	@ManyToOne()
	@JoinColumn(name = "cv")
	@JsonIgnore
	private Unemployed unemployeds;

}
