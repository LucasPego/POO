package com.example.chat.views.chat;

import java.util.ArrayList;

import java.util.List;

public class Teatro {

	private String[] lugares = new String[25];

	public String comprarIngresso(String nome, int numeroLugar) {
		try {
			if (lugares[numeroLugar - 1] == null) {
				lugares[numeroLugar - 1] = nome;
				return "Lugar " + (numeroLugar) + " reservado com sucesso";
			} else {
				return "Lugar Ocupado";
			}
		} catch (ArrayIndexOutOfBoundsException ai) {
			return "Lugar inválido";
		}
	}
	
	public String desocuparLugar(Integer posicao) {
		String resposta;
		/* System.out.println("Qual lugar você quer desocupar? (De 0 a 9)"); */
	    if (lugares[posicao-1] == null) {
	        resposta = "Não há ninguém nesse lugar";
	    }else {
	        lugares[posicao] = null;
	        resposta = "Lugar desocupado!";
	    }
	    return resposta;
	}

	public String obterLugaresOcupados() {
		List<Integer> listaLugares = new ArrayList<>();
		for (int posicao = 1; posicao < lugares.length; posicao++) {
			if (lugares[posicao] != null) {
				listaLugares.add(posicao+1);
			}
		}
		return "Lugares Ocupados -> " + listaLugares.toString();
	}

	public String obterLugaresVazios() {
		List<Integer> listaLugares = new ArrayList<>();
		for (int posicao = 0; posicao < lugares.length; posicao++) {
			if (lugares[posicao] == null) {
				listaLugares.add(posicao+1);
			}
		}
		return "Lugares Vazios -> " + listaLugares.toString();
	}
}
