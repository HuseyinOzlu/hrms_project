package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concrates.UserPhoto;


public interface UserPhotoService {
	Result add(UserPhoto photo);
}
