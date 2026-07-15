package com.luishkruger.productapi.controller;

import org.springframework.web.bind.annotation.RestController;
import com.luishkruger.productapi.service.ProdutoService;
import com.luishkruger.productapi.model.Produto;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

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
	@GetMapping("/produtos/{codigo}")
	public ResponseEntity<Produto> buscarPorCodigo(
			@PathVariable Integer codigo){
		Optional<Produto> produto = produtoService.buscarPorCodigo(codigo);
		
		if (produto.isPresent()) {
			return ResponseEntity.ok(produto.get());
		}
		return ResponseEntity.notFound().build();
	}
	@PutMapping("/produtos/{codigo}")
	public ResponseEntity<Produto> atualizar(
	        @PathVariable Integer codigo,
	        @RequestBody Produto produto) {

	    Optional<Produto> produtoAtualizado =
	            produtoService.atualizar(codigo, produto);

	    if (produtoAtualizado.isPresent()) {
	        return ResponseEntity.ok(produtoAtualizado.get());
	    }

	    return ResponseEntity.badRequest().build();
	}
	@DeleteMapping("/produtos/{codigo}")
	public ResponseEntity<Void> deletar(@PathVariable Integer codigo) {

	    boolean removido = produtoService.deletar(codigo);

	    if (removido) {
	        return ResponseEntity.ok().build();
	    }

	    return ResponseEntity.badRequest().build();
	}
}
