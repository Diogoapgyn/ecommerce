package br.com.senai.ecommerce.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short codigo;
	
	@Column(length = 50, unique = true)
	private String nome;
	
	@Column
	private Byte quantidade;
	
	//precision R$ 700,00 5casas e  scale casa depois da virgula
	@Column(precision = 5,scale = 2)
	private BigDecimal preco;
	
	@Column
	private LocalDate dataDeValidade;

}
