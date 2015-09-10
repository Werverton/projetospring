package br.com.senai.model;

public enum Cidades {
	RECIFE("Recife"),
	PESQUEIRA("Pesqueira"),
	PAULISTA("Paulita"),
	JABOATAO_DOS_GUARARAPES("Jabotão dos Guararapes"),
	OLINDA("Olinda"),
	CAMARAGIBE("Camaragibe"),
	SALGUEIRO("Salgueiro"),
	OURICURI("Ouricuri"),
	GARANHUNS("Garanhuns"),
	CABO_DE_SANTO_AGOSTINHO("Cabo de Santo Agostinho");
	
	private String cidades;
	
	private Cidades(String cidades){
		this.cidades = cidades;
	}

	public String getCidades() {
		return this.cidades;
	}

	
	
}
