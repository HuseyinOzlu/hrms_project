package kodlamaio.hrms.entities.concrates;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_title")
@AllArgsConstructor
@NoArgsConstructor
public class Jobs {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String jobTitle;
	
	@Column(name="position")
	private String position;
	
	@Column(name="last_date")
	private int date;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name = "is_job_open")
	private boolean isJobOpen;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobs")
	private List<City> city;
	
	@ManyToOne
	@JoinColumn(name="job_id")
	@JsonIgnore
	private Employers employers;
	
}
