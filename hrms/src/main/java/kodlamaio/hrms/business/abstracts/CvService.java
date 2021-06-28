package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.entities.Users;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrates.Cv;
import kodlamaio.hrms.entities.dtos.UnemployedWithCvDto;

public interface CvService {
	Result add(Cv cv);
		
	Result uploadPhoto(MultipartFile file, int userId);
	
	DataResult<List<Cv>> getAll();
	
	DataResult<List<Cv>> getAllSorted(String unemployedName);
	
	DataResult<List<UnemployedWithCvDto>> getUnemployedWithCvDetails();

	public void photoTableSetter(Users user);
	
}
