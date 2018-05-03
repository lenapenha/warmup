package br.com.warmup.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.warmup.model.Livro;
import br.com.warmup.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@PostMapping
	public ResponseEntity<Livro> criar(@RequestBody Livro livro) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(livroService.adicionaLivro(livro));
	}
	
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Livro> buscarPeloCodigo(@PathVariable Long codigo) {
		Optional<Livro> livro = livroService.buscaPorCodigo(codigo);
		return livro.isPresent() ? ResponseEntity.ok(livro.get()) : ResponseEntity.notFound().build();
	}
	

}
