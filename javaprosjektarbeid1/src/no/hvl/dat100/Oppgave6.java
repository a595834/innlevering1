package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Oppgave6 {

	public static void main(String[] args) {
		int fakultet = parseInt(showInputDialog("Ditt tall: "));
		int summert =1;
		for(;fakultet >=1;fakultet--) {
			summert *=fakultet;
		}
		showMessageDialog(null,summert);
	}

	}
