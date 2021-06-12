package kodlamaio.hrms.entities.concrates;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Jobs_title")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employers"})
public class Jobs {
	
	@Id
	@Column(name="Jobs_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int job_id;
	
	@Column(name="title")
	private String jobTitle;
	
	@ManyToOne
	@JoinColumn(name="Jobs_id")
	private Employers employers;
	
}
