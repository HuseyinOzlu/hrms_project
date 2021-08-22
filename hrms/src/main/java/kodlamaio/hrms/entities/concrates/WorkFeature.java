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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="workFeature")
public class WorkFeature {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="work_feature_id")
	private int id;
	
	@Column(name="work_feature_type")
	private String workFeatureType;
	
	@ManyToOne
	@JoinColumn(name="work_feature_id", insertable = false, updatable = false)
	@JsonIgnore
	private Jobs jobs;
}
