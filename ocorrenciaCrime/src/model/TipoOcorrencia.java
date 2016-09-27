package model;

public enum TipoOcorrencia {
	
	ASSALTO("Assalto a m�o armada"),
	ROUBO("Roubo qualificado ou por meio violento"),
	INVASAO("Invas�o domiciliar ou estabelecimento"),
	FURTO("Furto qualificado"),
	INVASAO_AUTOMOVEL("Invas�o � um autom�vel"),
	ROUBO_CARRO("Roubo de um autom�vel");
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	private TipoOcorrencia(String descricao) {
		this.descricao = descricao;
	}
}
