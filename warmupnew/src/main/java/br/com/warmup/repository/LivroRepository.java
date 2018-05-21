package br.com.warmup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.warmup.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
