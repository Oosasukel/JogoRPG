package br.com.gft.teste;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import br.com.gft.models.Classes;
import br.com.gft.models.Personagem;

public class TestePersonagem {
	//Para testar exceções: @Test(expected=RuntimeException.class)
	
	@Test
	public void ganhaUmNivelSeMatarUmCaraComVida20EAExpNaoMuda(){
		//Personagem começa com level 0
		Personagem personagem1 = new Personagem(100, 5, 3, Classes.Guerreiro);
		Personagem personagem2 = new Personagem(20, 2, 3, Classes.Monstro);
		Personagem personagem3 = new Personagem(10, 1, 1, Classes.Guerreiro);
		
		//Ganha 5 de experiência
		while(personagem3.getHp()>0) {
			personagem1.atacar(personagem3);
		}
		personagem1.calculaExp();
		
		while(personagem2.getHp()>0) {
			personagem1.atacar(personagem2);
		}
		personagem1.calculaExp();

		assertEquals(2, personagem1.getLevel());
		assertEquals(5, personagem1.getExp(), 0.00001);
	}
	
	
}
