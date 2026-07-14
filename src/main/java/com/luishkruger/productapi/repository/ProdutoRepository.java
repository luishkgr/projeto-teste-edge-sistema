package com.luishkruger.productapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.luishkruger.productapi.model.Produto;

public interface ProdutoRepository
	extends JpaRepository<Produto, Integer>{
}
