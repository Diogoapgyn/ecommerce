package br.com.senai.ecommerce.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.senai.ecommerce.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Test
	public void inserir() {
		
		Produto p1 = new Produto(
				null,
				"Coca Cola",
				Byte.valueOf("15"),
				BigDecimal.valueOf(10.50),
				LocalDate.of(2024,02,24)
				);
		Produto p2 = new Produto(
				null,
				"Guarana Antartica",
				Byte.valueOf("30"),
				BigDecimal.valueOf(6.50),
				LocalDate.of(2024,02,24)
				);
		
		
		produtoRepository.save(p1);
		produtoRepository.save(p2);
	}
}
