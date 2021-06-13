package kodlamaio.hrms.entities.concrates;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
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
@PrimaryKeyJoinColumn(name="id")
public class Employers extends Users {
	
	
	
	
	@Column(name="company_name")
	private String companyName;

	@Column(name="web_adress")
	private String companyWebSite;
	
	@Column(name="phone_number")
	private String companyPhone;
	
	

}
