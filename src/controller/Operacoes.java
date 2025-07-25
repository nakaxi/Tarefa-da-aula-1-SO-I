package controller;

public class Operacoes {

	public Operacoes() {
		super();
	}
	
//exc 1
	public void tempo() {
		int[] vt = new int[1000];
		double ti = System.nanoTime();
		for (int k = 0 ; k < 1000 ; k++ ) {
			vt[k] = 0;
		}
		double tf = System.nanoTime();
		double tt = tf - ti;
		tt = tt / Math.pow(10, 9);
		System.out.println("String ==> " +tt+"s.");
	}

	public void tempo2() {
		int[] vt = new int[10000];
		double ti = System.nanoTime();
		for (int k = 0 ; k < 10000 ; k++ ) {
			vt[k] = 0;
		}
		double tf = System.nanoTime();
		double tt = tf - ti;
		tt = tt / Math.pow(10, 9);
		System.out.println("String ==> " +tt+"s.");
	}
	
	public void tempo3() {
		int[] vt = new int[100000];
		double ti = System.nanoTime();
		for (int k = 0 ; k < 100000 ; k++ ) {
			vt[k] = 0;
		}
		double tf = System.nanoTime();
		double tt = tf - ti;
		tt = tt / Math.pow(10, 9);
		System.out.println("String ==> " +tt+"s.");
	}
//exc 2
	public void dividef(String frase) {
		int qntd = 0;
		String[] vtp = frase.split(";");
		for (String palavra : vtp) {
			qntd = qntd + 1;
		}
		System.out.println(qntd);
	}	
//exc 3
	public void impar(int[] vt2) {
		for (int x: vt2) {
			if (x % 2 == 0) {
				if (x % 10 == 0) {
					System.out.println("O número " + x + " é par e multiplo de 10.");	
				}
			} else {
				System.out.println("O número " + x + " é ímpar.");
			}
		}
	}
}
