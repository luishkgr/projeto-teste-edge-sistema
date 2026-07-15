package com.luishkruger.productapi.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produto {
	@Id
	private Integer codigo;
	
	private String nome;
	
	private BigDecimal preco;

	private String marca;
	
	public Produto() {
	}
	
	public Produto(Integer codigo, String nome, BigDecimal preco, String marca) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}	
}


