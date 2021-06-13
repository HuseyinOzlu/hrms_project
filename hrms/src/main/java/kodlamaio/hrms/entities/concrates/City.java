package kodlamaio.hrms.entities.concrates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="cities")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class City {
	
	@Column(name="city_id")
	@Id
	private int city_id;

	@Column(name="city_name")
	private String city_name;
	
}
