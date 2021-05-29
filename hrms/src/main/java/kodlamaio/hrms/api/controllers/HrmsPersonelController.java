package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.HrmsPersonelService;
import kodlamaio.hrms.entities.concrates.HrmsPersonel;

@RestController
@RequestMapping("api/hrmspersonel")
public class HrmsPersonelController {
	private HrmsPersonelService hrmsPersonelService;
	
	@Autowired
	public HrmsPersonelController(HrmsPersonelService hrmsPersonelService) {
		super();
		this.hrmsPersonelService = hrmsPersonelService;
	}
	@GetMapping("/getall")
	public List<HrmsPersonel> getAll(){
		return this.hrmsPersonelService.getAll();
		
	}
}
