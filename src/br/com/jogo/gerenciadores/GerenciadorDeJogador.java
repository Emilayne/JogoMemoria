package br.com.jogo.gerenciadores;

import java.util.ArrayList;
import java.util.List;

import br.com.jogo.entidades.Jogador;
import br.com.jogo.excecoes.JogadorInvalidoException;

public class GerenciadorDeJogador {

	
	private List<Jogador> jogadores;

	/**
	 * Construtor do Gerenciador de Jogadores, inicializando a lista de
	 * Jogadores.
	 */
	public GerenciadorDeJogador() {
		this.jogadores = new ArrayList<Jogador>();
	}

	/**
	 * Adiciona um jogador passado por par�metro na lista de jogadores.
	 * 
	 * @param jogador
	 *            Jogador a ser adicionado
	 */
	public void adicionarJogador(Jogador jogador) { 
		this.jogadores.add(jogador);
	}

	/**
	 * Remove um determinado jogador passado por par�metro da lista de
	 * jogadores.
	 * 
	 * @param jogador
	 *            Jogador a ser removido
	 */
	public void removerJogador(Jogador jogador) { 
		this.jogadores.remove(jogador);
	}

	
	/**
	 * M�todo que percorre a lista de jogadores para encontrar o jogador com
	 * maior pontua��o.
	 * 
	 * @return O jogador com maior pontua��o.
	 */
	public Jogador liderDoRankig() { 
		Jogador aux = null;

		for (Jogador j : jogadores) {
			if (aux == null) {
				aux = j;
			}

			if (j.getPontuacao() >= aux.getPontuacao()) {
				aux = j;
			}
		}

		return aux;
	}

	/**
	 * M�todo para pesquisar um jogador que recebe o nome do jogador a ser
	 * pesquisado por par�metro.
	 * 
	 * @param nome
	 *            Nome do jogador a ser pesquisado
	 * @return O jogador encontrado
	 * @throws JogadorInvalidoException
	 *             exce��o lan�ada caso n�o exista nenhum jogador na lista com o
	 *             nome pesquisado
	 */
	public Jogador pesquisarJogadorNome(String nome)
			throws JogadorInvalidoException {

		for (Jogador jogador : jogadores) { //
			if (jogador.getNome().equals(nome)) {
				return jogador;
			}
		}
		
		throw new JogadorInvalidoException("Jogador " + nome + " invalido!");
	}
}