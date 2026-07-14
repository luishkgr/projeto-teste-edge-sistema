package com.luishkruger.productapi.service;

import com.luishkruger.productapi.repository.ProdutoRepository;
import org.springframework.stereotype.Service;
import com.luishkruger.productapi.model.Produto;

import java.util.List;

@Service
public class ProdutoService {

	private final ProdutoRepository produtoRepository;

	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Produto salvar(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public List<Produto> listarTodos(){
		return produtoRepository.findAll();
	}
}
