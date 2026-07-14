package com.luishkruger.productapi.controller;

import org.springframework.web.bind.annotation.RestController;
import com.luishkruger.productapi.service.ProdutoService;
import com.luishkruger.productapi.model.Produto;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ProdutoController {
	
	private final ProdutoService produtoService;
	
	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}
	
	@PostMapping("/produtos")
	public Produto cadastrar(@RequestBody Produto produto) {
		return produtoService.salvar(produto);
	}
}
