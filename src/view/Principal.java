package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		
		ConverteController control = new ConverteController();
		
		int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero decimal:"));
		
		String converte = control.decToBin(entrada);
		
		System.out.println(converte);
	}

}