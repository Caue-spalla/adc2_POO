package pjAula10_16_04.br.program.modelagem;

/**
 * 
 * @author Caue Spalla Rovaron
 * Classe de modelagem conceitual de produto
 *
 */

public class Produto {
	
	//atributos
	private int codigo;
	private String descricao;
	private UnidadeMedida un;
	private float largura;
	private float comprimento;
	private Situacao situacao;
	private String localizacao;
	
	//metodos
	//getters and setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public UnidadeMedida getUn() {
		return un;
	}
	public void setUn(UnidadeMedida un) {
		this.un = un;
	}
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public String toString() {
		return "Codigo: " + getCodigo() + " Descrição: " + getDescricao() + " Unidade de medida: " + getUn().getDescricao() + " Largura: "
				+ getLargura() + " Comprimento: " + getComprimento() + " Situação: " + getSituacao() + " Localização: " + getLocalizacao();
	}
	
}
