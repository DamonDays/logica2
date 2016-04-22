package br.unifor.cct.cc.logica.pratica;

import java.util.*;

/*/
***
******
******
*By Luigi & Takeshi
*******
******
***
/*/

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Registro registro = new Registro();
		ImprimirTabular(registro);
		System.out.println("");
		double[] media = Media(registro);
		ImprimirMedia(registro, media);
		System.out.println("");
		System.out.print("Informe uma matrícula: ");
		int matricula1 = scan.nextInt();
		while(matricula1 != 0){
		System.out.printf("Matricula existente: %b \n", Matricula(registro, matricula1));
		System.out.print("Informe uma matrícula: ");
		matricula1 = scan.nextInt();
		}
	}

	public static void ImprimirTabular(Registro registro) {
		for (int i = 0; i < registro.nome.length; i++) {
			System.out.printf("%d \t %s \t %4.1f \t %4.1f \t %4.1f \n", registro.matricula[i], registro.nome[i],
					registro.n1[i], registro.n2[i], registro.n3[i]);
		}
	}
	public static double[] Media(Registro registro){
		double[] media = new double[registro.n1.length];
		for (int i = 0; i < registro.n1.length; i++) {
			media[i] = (registro.n1[i] + registro.n2[i] + registro.n3[i])/3;
		}
		return media;
	}
	public static void ImprimirMedia(Registro registro, double[] media){
		for (int i = 0; i < media.length; i++) {
			System.out.printf("%s \t %4.2f \n", registro.nome[i], media[i]);
		}
	}
	public static boolean Matricula(Registro registro, int matricula){
		int cont = 0;
		for (int i = 0; i < registro.matricula.length; i++) {
			if(matricula == registro.matricula[i]){
				cont++;
			}
		}
		if(cont == 1){
			return true;
		}else{
			return false;
		}
	}
}
