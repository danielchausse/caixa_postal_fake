package br.com.correios.dto;

public class LogradouroDTO {
	
	private String unidadeLogradouro; 
	private String nomeLogradouro;
	private String bairroDistrito;
	private String localidadeUf;
	private String cep;
	private String caixa;


	
	
	//GCUF - cria um construtor com todos os parametros
	public LogradouroDTO(String unidadeLogradouro, String nomeLogradouro, String bairroDistrito, String localidadeUf, String cep, String caixa) {
		
		this.unidadeLogradouro = unidadeLogradouro; 
		this.nomeLogradouro = nomeLogradouro;
		this.bairroDistrito = bairroDistrito;
		this.localidadeUf = localidadeUf;
		this.cep = cep;
		this.caixa = caixa;
		
	
	}
	
	public String getNomeLogradouro() {
		return nomeLogradouro;
	}
	
	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}
	
	public String getBairroDistrito() {
		return bairroDistrito;
	}
	
	public void setBairroDistrito(String bairroDistrito) {
		this.bairroDistrito = bairroDistrito;
	}
	
	public String getLocalidadeUf() {
		return localidadeUf;
	}
	
	public void setLocalidadeUf(String localidadeUf) {
		this.localidadeUf = localidadeUf;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUnidadeLogradouro() {
		return unidadeLogradouro;
	}

	public void setUnidadeLogradouro(String unidadeLogradouro) {
		this.unidadeLogradouro = unidadeLogradouro;
	}

	public String getCaixa() {
		return caixa;
	}

	public void setCaixa(String caixa) {
		this.caixa = caixa;
	}

	

	

}
