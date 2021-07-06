package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvService;
import kodlamaio.hrms.business.abstracts.UnemployedService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrates.Unemployed;
import kodlamaio.hrms.entities.dtos.UnemployedWithCvDto;

@RestController
@RequestMapping(path = "api/unemployers")
@CrossOrigin
public class UnemployersController {
	
	private UnemployedService unemployedService;
	private CvService cvServices;
	@Autowired
	public UnemployersController(UnemployedService unemployedService,CvService cvServices) {
		super();
		this.unemployedService = unemployedService;
		this.cvServices = cvServices;
	}
	@GetMapping(path = "getall")
	public DataResult<List<Unemployed>> getAll(){
		return this.unemployedService.getAll();
	}
	
	@GetMapping(path = "getunemployedwitcvdetails")
	public DataResult<List<UnemployedWithCvDto>> getunemployedwitcvdetails(){
		return this.cvServices.getUnemployedWithCvDetails();
	}
	
	@PostMapping(path = "add")
	public Result add(@RequestBody Unemployed unemployed) {
		return this.unemployedService.add(unemployed);
		
	}
	
	
	
	
}
