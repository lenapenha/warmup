package br.com.warmup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.warmup.model.Livro;
import br.com.warmup.repository.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	public Livro adicionaLivro(Livro livro) {
		return livroRepository.save(Livro.of(livro));
	}

	public Livro buscaPorCodigo(Long codigo) {
		return livroRepository.findOne(codigo);
	}

	public List<Livro> buscaTodos() {
		return livroRepository.findAll();
	}

}
