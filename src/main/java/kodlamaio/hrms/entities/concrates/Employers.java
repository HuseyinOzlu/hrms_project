package kodlamaio.hrms.entities.concrates;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@PrimaryKeyJoinColumn(name = "user_id")
@NoArgsConstructor
@AllArgsConstructor
public class Employers extends Users {
	
	@Column(name="Company_name")
	private String companyName;

	@Column(name="Web_adress")
	private String companyWebSite;
	
	@Column(name="Phone_number")
	private String companyPhone;

}
