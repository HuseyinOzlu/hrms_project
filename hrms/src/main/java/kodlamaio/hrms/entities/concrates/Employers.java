package kodlamaio.hrms.entities.concrates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;



@Entity
@Table(name ="employers")
@Data
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name="id")
public class Employers extends Users {
	
	
	@Column(name="Id")
	private int id;
	
	@Column(name="Company_name")
	private String companyName;

	@Column(name="Web_adress")
	private String companyWebSite;
	
	@Column(name="Phone_number")
	private String companyPhone;
	
	public Employers() {
		
	}

	public Employers(int id, String mail, String pass, String companyName, String companyWebSite,
			String companyPhone) {
		super(id, mail, pass);
		this.companyName = companyName;
		this.companyWebSite = companyWebSite;
		this.companyPhone = companyPhone;
	}
	
	

	

	

	
}
