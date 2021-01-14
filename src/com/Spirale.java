package com;

import java.io.FileWriter;
import java.io.IOException;

public class Spirale {
	Bounds bound ;
	private int [][] matrice;
	private int contatore=0,Larghezza;
	
	
	Spirale(int larghezza){
		Larghezza=larghezza;
		bound = new Bounds(0,larghezza,larghezza,0);
		matrice = new int[larghezza][larghezza];
	}
	
	public void fromNordToEst() {
		for(int i=bound.getn();i<bound.gete();i++) {
			matrice[bound.getn()][i]=++contatore;
		}
		bound.nBound(bound.getn()+1);
	}
	public void fromNordToSouth() {
		for(int i=bound.getn();i<bound.gets();i++) {
			matrice[i][bound.gete()-1]=++contatore;
		}
		bound.eBound(bound.gete()-1);
	}
	public void fromSouthToOvest() {
		for(int i=bound.gete()-1;i>=bound.geto();i--) {
			matrice[bound.gete()][i]=++contatore;
		}
		bound.sBound(bound.gets()-1);
	}
	public void fromSouthToNorth() {
		for(int i =bound.gete()-1;i>=bound.getn();i--) {
			matrice[i][bound.geto()]=++contatore;
		}
		bound.oBound(bound.geto()+1);
	}
	public void printMatrice() {
		for(int i = 0; i<Larghezza;i++) {
			for(int j=0;j<Larghezza;j++) {
				System.out.printf("%d\t",matrice[i][j]);
			}
			System.out.print("\n");
		}
	}
	public void salvaMatrice() throws IOException {
		// scrivere in formato ppm per semplicita'
		String header = "P2\n"+Larghezza+" "+Larghezza+"\n65535\n";
		FileWriter fw = new FileWriter("spirale.ppm");
		fw.write(header);
		for(int i = 0; i<Larghezza;i++) {
			for(int j=0;j<Larghezza;j++) {
				String s = matrice[i][j]+" ";
				fw.write(s);
			}
			fw.write("\n");
		}
		fw.close();
	}
	
	public int posizioneContatore() {
		return contatore;
	}
	

}
