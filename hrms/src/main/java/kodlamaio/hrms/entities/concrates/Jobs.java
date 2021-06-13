package kodlamaio.hrms.entities.concrates;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_title")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Jobs {
	
	@Id
	@Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int job_id;
	
	@Column(name="title")
	private String jobTitle;
	
	@Column(name="position")
	private String position;
	
	@Column(name="last_date")
	private int date;
	
	@Column(name="salary")
	private int salary;
	
	@OneToMany(mappedBy = "jobs")
	private List<City> city;
	
	@ManyToOne
	@JoinColumn(name="jobs_id")
	private Employers employers;
	
}
