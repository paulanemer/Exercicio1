/**
 * 
 */
package br.gov.sp.fatec;

/**
 * @author Paula
 *
 */
public class Tela {
	
	/**
	 * Mensagem a ser exibida na placa
	 */
	private Cadastro registro;
	private Cadastro sobrenome;
	private Cadastro telefone;
	private Cadastro profissao;
	
	/**
	 * Construtor
	 */
	public Tela() {
	}
	
	/**
	 * Retorna o texto da placa
	 * @return Texto da placa
	 */
	public String concatenar() {
		return registro.getConcatena();
	}
	
	/**
	 * Setter para mensagem
	 * @param mensagem
	 */
	public void setNome(Cadastro registro) {
		this.registro = registro;
	}
	public void setSobreNome(Cadastro sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setTelefone(Cadastro telefone) {
		this.telefone = telefone;
	}
	public void setProfissao(Cadastro profissao) {
		this.profissao = profissao;
	}
}
