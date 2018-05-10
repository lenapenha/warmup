package br.com.warmup.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import br.com.warmup.auth.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	
//	@Query("SELECT u FROM User u WHERE LOWER(u.username) = LOWER(:username)")
//    Optional<User> findByUsername(@Param("username") String username);
	
	Optional<User> findByUsername(String username);

}
