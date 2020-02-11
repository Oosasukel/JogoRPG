package br.com.gft.main;

import java.util.ArrayList;

import br.com.gft.models.Classes;
import br.com.gft.models.Personagem;
import br.com.gft.models.PersonagemFactory;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Personagem> personagens = new ArrayList<Personagem>();
		PersonagemFactory personagemFactory = new PersonagemFactory();
		
		Personagem guerreiro = personagemFactory.getPersonagem(Classes.Guerreiro);
		Personagem monstro = personagemFactory.getPersonagem(Classes.Monstro);
		
	}
}
