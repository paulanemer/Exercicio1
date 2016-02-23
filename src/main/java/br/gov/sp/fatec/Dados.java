/**
 * 
 */
package br.gov.sp.fatec;

/**
 * @author Paula
 *
 */
public class Dados implements Cadastro {
	
	/**
	 * Um nome
	 */
	private String nome;
	private String sobrenome;
	private String telefone;
	private String profissao;
	
	/**
	 * Construtor
	 */
	public Dados() {
	}
	
	/**
	 * Setter do atributo nome
	 * @param nome Um nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	@Override
	public String getConcatena() {
		return "Nome Completo: " + nome + sobrenome + "\nProfissao: " +profissao + "\nTelefone:" +telefone;
	}

}
