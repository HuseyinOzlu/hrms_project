package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.CvService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrates.Cv;

@RestController
@RequestMapping(path = "api/cv")
public class CvControllers {
	
		private CvService cvService;
		
		@Autowired
		public CvControllers(CvService cvService) {
			super();
			this.cvService = cvService;
		}
		
		@GetMapping(path = "getall")
		public DataResult<List<Cv>> getAll(){
			return this.cvService.getAll();
		}
		
		@PostMapping(path = "add")
		public Result add(@RequestBody Cv cv) {
			return this.cvService.add(cv);
		}
		
		@PostMapping(path = "photoadd")
		public Result photoAdd(@RequestBody MultipartFile file, int id) {
			return this.cvService.uploadPhoto(file, id);
		}
}
