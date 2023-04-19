package principal;

import java.security.SecureRandom;

public class Enquete {
	private int[] notas;
	public static SecureRandom gerador = new SecureRandom();
	
	public Enquete(int quant) {
		notas = new int[quant];
		preencher();
	}
	
	public void preencher() {
		for (int i=0; i<notas.length; i++) {
			notas[i] = gerador.nextInt(10)+1;
		}
	}
	
	public int frequencia(int nota) {
		int soma=0;
		
		for (int i=0; i<notas.length; i++) {
			if (nota == notas[i]) {
				soma++;
			}
		}
		
		return soma;
	}
	
	public double media() {
		double soma=0;
		
		for (int i=0; i<notas.length; i++) {
			soma += notas[i];
		}
		
		return soma/notas.length;
	}

	public int quantClientes() {
		return notas.length;
	}
	
	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}
}
