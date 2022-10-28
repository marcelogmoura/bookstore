package com.mgmoura.bookstoreweb;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mgmoura.bookstoreweb.domain.Categoria;
import com.mgmoura.bookstoreweb.domain.Livro;
import com.mgmoura.bookstoreweb.repositories.CategoriaRepository;
import com.mgmoura.bookstoreweb.repositories.LivroRepository;

@SpringBootApplication
public class BookstorewebApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;	
	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookstorewebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática", "descrição livros");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "lorem ipsum", cat1);
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));
		
		
	}

}
