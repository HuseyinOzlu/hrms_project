package kodlamaio.hrms.api.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobsService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrates.Jobs;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	private JobsService jobsService;
	
	@Autowired
	public JobsController(JobsService jobsService) {
		super();
		this.jobsService = jobsService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Jobs>> getAll(){
		return this.jobsService.getAll();
				
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Jobs jobs) {
		return this.jobsService.add(jobs);
	}
	
	@GetMapping("/getOpenJob")
	public DataResult<List<Jobs>> getByIsJobOpenTrue(){
		return this.jobsService.getByIsJobOpenTrue();
	}
	
	@GetMapping("/getOpenJobAndCompanyName")
	public DataResult<List<Jobs>> getByIsJobOpenTrueAndEmployers_CompanyName(String companyName)
	{
		return this.jobsService.getByIsJobOpenTrueAndEmployers_CompanyName(companyName);
	}
	
	@GetMapping("/getOpenJobAndDate")
	public DataResult<List<Jobs>> getByIsJobOpenTrueAndDateLessThanEqual(int date){
		return this.jobsService.getByIsJobOpenTrueAndDateLessThanEqual(date);
	}
	
} 
