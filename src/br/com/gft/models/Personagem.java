package br.com.gft.models;

import java.util.Random;

public class Personagem {
	

	private double hp;
	private int level;
	private double exp;
	private double ataque;
	private double defesa;
	private Classes classe;
	private double danoAcumulado;
	
	public Personagem(double hp, double ataque, double defesa, Classes classe) {
		this.hp = hp;
		this.level = 1;
		this.exp = 0;
		this.ataque = ataque;
		this.defesa = defesa;
		this.classe = classe;
		danoAcumulado = 0;
	}
	
	public int getLevel() {
		return level;
	}

	public double getExp() {
		return exp;
	}
	
	public double getHp() {
		return hp;
	}
	
	public void atacar(Personagem outro) {
		var random = 10 + new Random().nextInt(10);
		var dano = (this.ataque * random) - (outro.defesa * random);
		
		if(outro.hp <= dano) {
			dano = outro.hp; 
		}
		outro.hp -= dano;
		danoAcumulado += dano;
	}
	
	//Método que será chamado ao final de toda batalha para calcular a experiencia e zerar o dano acumulado
	public void calculaExp() {
		var expGanho = danoAcumulado / 2;
		
		exp += expGanho;
		
		while(exp >= 10) {
			exp -= 10;
			level += 1;
		}
		
		danoAcumulado = 0;
	}
}
