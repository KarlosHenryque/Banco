package banco;

import bancoException.BancoException;

public class DadosBanco {
	
	private Integer numero; 
	private String nome; 
	private Double saldo;
	private Double saque;
	
	public DadosBanco(){
	}

	public DadosBanco(Integer numero, String nome, Double saldo, Double saque) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.saque = saque;
	}

	protected Integer getNumero() {
		return numero;
	}

	protected void setNumero(Integer numero) {
		this.numero = numero;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	protected Double getSaque() {
		return saque;
	}

	protected void setSaque(Double saque) {
		this.saque = saque;
	}

	public double depostido (double deposito) {
		return saldo += deposito;
	}
	
	public double saque (double saque) {
		validateSaque(saque);
		return saldo -= saque;
	}
	
	public void validateSaque(Double saque) {
		if (saque > getSaque()) {
			throw new BancoException("Erro de saque: A quantia excede o limite de saque");
		}
		if(saque > getSaldo()) {
			throw new BancoException("Erro de saque: Saldo insuficiente");
		}
	}
	
	

}
