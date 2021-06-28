package kodlamaio.hrms.business.concrates;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import kodlamaio.hrms.business.abstracts.CvService;
import kodlamaio.hrms.core.dataAccess.UserPhotoDao;
import kodlamaio.hrms.core.entities.Users;
import kodlamaio.hrms.core.utilities.adapters.abstracts.CloudinaryService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvDao;
import kodlamaio.hrms.entities.concrates.Cv;
import kodlamaio.hrms.entities.concrates.UserPhoto;
import kodlamaio.hrms.entities.dtos.UnemployedWithCvDto;

@Service
@Lazy
public class CvManage implements CvService {
	private CvDao cvDao;
	private CloudinaryService photoService;
	private UserPhotoDao userPhotoDao;
	
	@Autowired
	public CvManage(CvDao cvDao,CloudinaryService photoService,
			UserPhotoDao userPhotoDao) {
		super();
		this.cvDao = cvDao;
		this.photoService = photoService;
		this.userPhotoDao = userPhotoDao;
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Success,Cv saved");
	}

	@Override
	public DataResult<List<Cv>> getAllSorted(String unemployedName) {
		Sort sort = Sort.by(Sort.Direction.fromString(unemployedName));
		return new SuccessDataResult<List<Cv>>
		(this.cvDao.findAll(sort),"Succes Data listed");
	}

	@Override
	public DataResult<List<UnemployedWithCvDto>> getUnemployedWithCvDetails() {
		return new SuccessDataResult<List<UnemployedWithCvDto>>
			(this.cvDao.getUnemployedWithCvDetails(),"Success");	
			}

	@Override
	public DataResult<List<Cv>> getAll() {
		return new SuccessDataResult<List<Cv>>(
				this.cvDao.findAll(),"Success, finded all");
	}


	@Override
	public Result uploadPhoto(MultipartFile file, int userId) {
	@SuppressWarnings("unchecked")
	Map<String, String> cloudinaryUploader = (Map<String, String>) 
				photoService.save(file).getData();
		String imageUrl= cloudinaryUploader.get("url");
		UserPhoto userPhoto = userPhotoDao.findByUser_Id(userId);
		userPhoto.setPhotoUrl(imageUrl);
		userPhotoDao.save(userPhoto);
		
		return new SuccessResult("Photo saved");
	}

	@Override
	public void photoTableSetter(Users user) {
		UserPhoto userPhoto = new UserPhoto();
		userPhoto.setUser(user);
		userPhotoDao.save(userPhoto);
	}


	}

