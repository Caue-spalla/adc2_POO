package pjAula10_16_04.br.program.modelagem;

public enum UnidadeMedida {
	UN ("UN", "Unidade"),
	PC ("PC", "Peça"),
	MT ("MT", "Metro"),
	TON ("TON", "Tonelada"),
	CX ("CX", "Caixa"),
	DZ ("DZ", "Dúzia"),
	LT ("LT", "Litro"),
	RL ("RL", "Rolo");
	
	private String unidade;
	private String descricao;
	
	public String getValue (String UN) {
		for(UnidadeMedida un : UnidadeMedida.values()) {
			if(un.unidade.equals(UN)) {
				return un.descricao;
			}
		}
		return null;
	}

	private UnidadeMedida(String unidade, String descricao) {
		this.unidade = unidade;
		this.descricao = descricao;
	}
	
	public static  String[] getUnidades(){
		String unidades[] = new String[UnidadeMedida.values().length];
		int cont = 0;
		for(UnidadeMedida un : UnidadeMedida.values()) {
			unidades[cont++] = un.getUnidade() + " - " + un.getDescricao();
		}
		return unidades;
	}
	
	
	//getters and setters
	public String getUnidade() {
		return unidade;
	}
	public String getDescricao() {
		return descricao;
	}
}
