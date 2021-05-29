package kodlamaio.hrms.entities.concrates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	private int id;
	
	@Column(name="title")
	private String jobTitle;

	
}
