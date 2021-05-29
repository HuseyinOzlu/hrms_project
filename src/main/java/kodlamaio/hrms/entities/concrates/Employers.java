package kodlamaio.hrms.entities.concrates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Entity
@Table(name ="employers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Employers extends Users {
	
	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;

	@Column(name="web_adress")
	private String companyWebSite;
	
	@Column(name="phone_number")
	private String companyPhone;
	
	

	

	

	
}
