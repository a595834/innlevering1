package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave5 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
		int poeng = parseInt(showInputDialog("Poengsum: "));
		String karakter = "F";

		if(poeng >= 0 && poeng <= 100) {
			
			if(poeng <= 39) {
				karakter = "F";	
			}
			else if(poeng <= 49) {
				karakter = "E";
			}
			else if(poeng <= 59) {
				karakter = "D";
			}
			else if(poeng <= 79) {
				karakter = "C";
			}
			else if(poeng <= 89) {
				karakter = "B";
			}
			else if(poeng <=100) {
				karakter = "A";
			}
			System.out.println("Du fikk karakter : " + karakter );
		}
		else {
		System.out.println("Ikke gyldig poengsum. Prøv igjen!");
		}
	}
	}
}
