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
@Table(name="worker_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="worker_type_id")
	private int id;
	
	@Column(name="worker_type_name")
	private String workerTypeName;

	@ManyToOne
	@JoinColumn(name="worker_type_id", insertable = false, updatable = false)
	@JsonIgnore
	private Jobs jobs;
}
