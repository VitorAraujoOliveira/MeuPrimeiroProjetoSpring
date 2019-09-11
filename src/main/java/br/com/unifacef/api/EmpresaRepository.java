package br.com.unifacef.api;

//package br.com.unifacef.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacef.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	Empresa findByCnpj(String cnpj);
}