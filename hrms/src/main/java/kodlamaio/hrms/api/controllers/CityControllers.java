package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concrates.City;

@RestController
@RequestMapping(path = "/api/city")
public class CityControllers {
		
		private CityService cityService;
		
		@Autowired
		public CityControllers(CityService cityService) {
			super();
			this.cityService = cityService;
		}
		
		@GetMapping(path = "getAll")
		public DataResult<List<City>> getAll(){
			return this.cityService.getAll();
		}
}
