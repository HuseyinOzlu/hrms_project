package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.WorkFeatureService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concrates.WorkFeature;

@RestController
@RequestMapping(path ="/api/workfeature")
@CrossOrigin
public class WorkFeatureControllers {
	private WorkFeatureService workFeatureService;

	@Autowired
	public WorkFeatureControllers(WorkFeatureService workFeatureService) {
		super();
		this.workFeatureService = workFeatureService;
	}
	
	@GetMapping(path="getall")
	public DataResult<List<WorkFeature>> getAll(){
		return this.workFeatureService.getAll();
	}
	
}
