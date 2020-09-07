package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave4 {

	public static void main(String[] args) {
		int inntekt = parseInt(showInputDialog("Inntekt i 2020:"));
		double prosent = 0.0;
		
		if(inntekt > 0) {
			
			if (inntekt <= 180800) {
				prosent = 0.0;
			}
			else if (inntekt <= 254500) {
				prosent = 1.9;
			}
			else if (inntekt <= 639750) {
				prosent = 4.2;
			}
			else if (inntekt <= 999550) {
				prosent = 13.2;
			}
			else {
				prosent = 16.2;
			}
		}
		
		System.out.println("Lønnen er: " + inntekt);
		System.out.println("Trinnskatt i %: " + prosent);
		System.out.println("Du betaler : " + inntekt/100*prosent + " i skatt");
		
	}

}
