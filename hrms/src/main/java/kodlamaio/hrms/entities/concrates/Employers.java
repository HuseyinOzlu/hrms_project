package kodlamaio.hrms.entities.concrates;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.hrms.core.entities.Users;
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
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobs","Jobs"})
public class Employers extends Users {
	
	
	
	
	@Column(name="company_name")
	private String companyName;

	@Column(name="web_adress")
	private String companyWebSite;
	
	@Column(name="phone_number")
	private String companyPhone;
	
	@OneToMany(mappedBy = "employers")
	@JsonIgnore
	private List<Jobs> jobs;

}
