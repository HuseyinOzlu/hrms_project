package kodlamaio.hrms.entities.concrates;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name ="employers")
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
public class Employers extends Users {
	
	@Id
	@Column(name="employer_id")
	private int employers_Id;
	
	@Column(name="Company_name")
	private String companyName;

	@Column(name="Web_adress")
	private String companyWebSite;
	
	@Column(name="Phone_number")
	private String companyPhone;
	
	@OneToMany(mappedBy = "employers")
	private List<Jobs> jobs;
	

}
