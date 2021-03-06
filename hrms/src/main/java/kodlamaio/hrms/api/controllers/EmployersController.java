package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrates.Employers;

@RestController
@RequestMapping("/api/employers")
@CrossOrigin
public class EmployersController {
	private EmployersService employerService;
	
	@Autowired
	public EmployersController(EmployersService employerService) {
		super();
		this.employerService = employerService;
	}

	@GetMapping("/getall")
	public DataResult<List<Employers>> getAll() {
		return this.employerService.getAll();
	}
	
	
	
	@PostMapping("/register")
	public Result add(@RequestBody Employers employers) {
		return this.employerService.add(employers);
		
	}
}

