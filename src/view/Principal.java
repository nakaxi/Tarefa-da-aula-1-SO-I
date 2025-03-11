package view;

import controller.Operacoes;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		Operacoes op = new Operacoes();
		String frase = JOptionPane.showInputDialog("frase = ");
		op.tempo();
		op.tempo2();
		op.tempo3();
		op.dividef(frase);
		frase = "abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela;manga";
		op.dividef(frase);
		frase = "acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula;agrião";
		op.dividef(frase);
		int n = 101;
		while (n > 100) {
			n = Integer.parseInt(JOptionPane.showInputDialog("tamanho do vetor (limite de 100) = "));
		}
		int[] vt2 = new int[n];
		for (int k = 0 ; k < n ; k++) {
			vt2[k] = Integer.parseInt(JOptionPane.showInputDialog("preencha vetor = "));
		}
		op.impar(vt2);
	}

}
