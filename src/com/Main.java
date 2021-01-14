package com;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		int grandezzaSpirale = 255;
		Spirale spirale = new Spirale(grandezzaSpirale);
		

		while(spirale.posizioneContatore() < quadrato(grandezzaSpirale) ) {
			spirale.fromNordToEst();
			spirale.fromNordToSouth();
			spirale.fromSouthToOvest();
			spirale.fromSouthToNorth();
		}
		
		spirale.printMatrice();
		
		try {
			spirale.salvaMatrice();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static int quadrato(int numero) {
		return numero * numero;
	}

}
