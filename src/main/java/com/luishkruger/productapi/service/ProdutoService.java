package com.luishkruger.productapi.service;

import com.luishkruger.productapi.repository.ProdutoRepository;
import org.springframework.stereotype.Service;
import com.luishkruger.productapi.model.Produto;

import java.util.List;
import java.util.Optional;

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
	
	public Optional<Produto> buscarPorCodigo(Integer codigo){
		return produtoRepository.findById(codigo);
	}
	
	public Optional<Produto> atualizar(Integer codigo, Produto produto){
		
		if (produtoRepository.existsById(codigo)) {
			
			produto.setCodigo(codigo);
			
			return Optional.of(produtoRepository.save(produto));
			
		}
		return Optional.empty();
	}
	
	public boolean deletar(Integer codigo) {

	    if (!produtoRepository.existsById(codigo)) {
	        return false;
	    }

	    produtoRepository.deleteById(codigo);

	    return true;
	}
}
