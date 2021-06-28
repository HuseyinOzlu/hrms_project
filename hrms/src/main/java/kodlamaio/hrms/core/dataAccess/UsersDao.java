package kodlamaio.hrms.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.core.entities.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{
			Users findById(int userId);
}
