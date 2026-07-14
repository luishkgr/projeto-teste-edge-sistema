package com.luishkruger.productapi.controller;

import org.springframework.web.bind.annotation.RestController;
import com.luishkruger.productapi.service.ProdutoService;
import com.luishkruger.productapi.model.Produto;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ProdutoController {
	
	private final ProdutoService produtoService;
	
	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}
	
	@PostMapping("/produtos")
	public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto){
		
			Produto produtoSalvo = produtoService.salvar(produto);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);
	}
	@GetMapping("/produtos")
	public List<Produto> listarTodos(){
		return produtoService.listarTodos();
	}
	
}
