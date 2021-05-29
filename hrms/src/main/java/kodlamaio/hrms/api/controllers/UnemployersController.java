package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UnemployedService;
import kodlamaio.hrms.entities.concrates.Unemployed;

@RestController
@RequestMapping("api/unemployers")
public class UnemployersController {
	@Autowired
	private UnemployedService unemployedService;
	
	public UnemployersController(UnemployedService unemployedService) {
		super();
		this.unemployedService = unemployedService;
	}
	@GetMapping("/getall")
	public List<Unemployed> getAll(){
		return this.unemployedService.getAll();
	}
	
	
	
	
}
