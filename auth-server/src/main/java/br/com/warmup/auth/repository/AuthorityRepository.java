package br.com.warmup.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.warmup.auth.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);

}
