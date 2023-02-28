package com.matera.bootcamp;

import carteira.Conta;
import carteira.Titular;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class BootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);

		var titular1 = new Titular("Julissy", "223.444.555-37");
		var conta1 = new Conta(12345, 4, BigDecimal.ZERO, titular1);


		System.out.println(conta1.getTitular().getNome());

	}




}
