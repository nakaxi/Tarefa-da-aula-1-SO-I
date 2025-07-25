package view;

import controller.Operacoes;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		Operacoes op = new Operacoes();
		System.out.println("exc 1 ---------");
		op.tempo();
		op.tempo2();
		op.tempo3();
		System.out.println("exc 2 ---------");
		String frase = JOptionPane.showInputDialog("frase = ");
		op.dividef(frase);
		frase = "abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela;manga";
		op.dividef(frase);
		frase = "acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula;agrião";
		op.dividef(frase);
		System.out.println("exc 3 ---------");
		int n = 101;
		while (n > 100 || n < 0 ) {
			n = Integer.parseInt(JOptionPane.showInputDialog("tamanho do vetor (limite de 100) = "));
		}
		int[] vt2 = new int[n];
		for (int k = 0 ; k < n ; k++) {
			vt2[k] = Integer.parseInt(JOptionPane.showInputDialog("preencha vetor = "));
		}
		op.impar(vt2);
	}

}
