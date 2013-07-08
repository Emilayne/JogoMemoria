package br.com.jogo.excecoes;

public class Posi��oInvalidaException extends Exception {
	String erro;

	public Posi��oInvalidaException() {
		super(); // chamar o construtor da superclasse
		erro = "unknown";
	}

	
	public Posi��oInvalidaException(String err) {
		super(err); // chamar o construtor da superclasse
		erro = err; // salva messagem
	}

	public String getError() {
		return erro;
	}
}
