package kodlamaio.hrms.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concrates.UserPhoto;

public interface UserPhotoDao extends JpaRepository<UserPhoto, Integer> {
		UserPhoto findByUser_Id(int userId);
}
