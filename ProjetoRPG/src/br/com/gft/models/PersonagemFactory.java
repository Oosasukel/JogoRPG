package br.com.gft.models;

public class PersonagemFactory {
	public Personagem getPersonagem(Classes classe) {
		switch (classe) {
		case Monstro:
			return new Personagem(100, 2, 4, Classes.Monstro);
		case Guerreiro:
			return new Personagem(100, 5, 1, Classes.Guerreiro);
		default:
			return null;
		}
	}
}
