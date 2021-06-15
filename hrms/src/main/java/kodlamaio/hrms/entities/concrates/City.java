package kodlamaio.hrms.entities.concrates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="cities")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"city_id","jobs"})
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="city_id")
	private int city_id;

	@Column(name="city_name")
	private String city_name;

	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name = "cities")
	private Jobs jobs;

}
