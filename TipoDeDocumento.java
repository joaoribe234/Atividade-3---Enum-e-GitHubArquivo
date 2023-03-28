
public enum TipoDeDocumento {

	RG("Registro Geral"),
	CPF("Cadastro de Pessoa F�sica"),
	CNPJ("Cadastro de Pessoa J�ridica");
	private String descricao;
	
	TipoDeDocumento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
