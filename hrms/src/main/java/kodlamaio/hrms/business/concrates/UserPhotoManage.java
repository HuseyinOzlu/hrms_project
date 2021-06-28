package kodlamaio.hrms.business.concrates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserPhotoService;
import kodlamaio.hrms.core.dataAccess.UserPhotoDao;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concrates.UserPhoto;

@Service
public class UserPhotoManage implements UserPhotoService {
	private UserPhotoDao photo;

	@Autowired
	public UserPhotoManage(UserPhotoDao photo) {
		super();
		this.photo = photo;
	}

	@Override
	public Result add(UserPhoto photo) {
		this.photo.save(photo);
		return new SuccessResult();
	}
	
	
}
