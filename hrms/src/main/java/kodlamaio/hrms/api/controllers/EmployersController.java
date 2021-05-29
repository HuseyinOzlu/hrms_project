package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.entities.concrates.Employers;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

private EmployersService employerService;
	
	@Autowired
	public EmployersController(EmployersService employerService) {
		super();
		this.employerService = employerService;
	}

	@GetMapping("/getall")
	public List<Employers> getAll() {
		
		return this.employerService.getAll();
	}
}
