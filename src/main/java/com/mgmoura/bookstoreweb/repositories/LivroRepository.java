package com.mgmoura.bookstoreweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgmoura.bookstoreweb.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
