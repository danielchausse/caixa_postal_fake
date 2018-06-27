

package br.com.correios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.correios.dto.LogradouroDTO;
import br.com.correios.model.Logradouro;

public interface LogradouroRepository extends JpaRepository<Logradouro, Long>{
	//Busca JPQl - consulta de banco de dados OO
	@Query("Select new br.com.correios.dto.LogradouroDTO(l.unidade, l.nome, l.bairro.nome, concat(l.bairro.cidade.nome, '/', l.bairro.cidade.estado.uf), l.cep, l.caixa) from Logradouro l where l.cep = :parametro or l.nome like concat('%', :parametro, '%')")
	List<LogradouroDTO> buscaPorNomeLogradouroOulocalidadeUf(@Param("parametro") String parametro);


	


	
	
}

