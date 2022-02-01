package guruChallenge;

import java.util.Scanner;

public class GuruChallenge {

	public static void main(String[] args) {
		
		double weight, height, result;
		
		Scanner enter = new Scanner(System.in);
		System.out.println("Ingrese su peso en kilogramos: ");
		weight = enter.nextDouble();
		
		System.out.println("Ingrese su estatura en metros: ");
		height = enter.nextDouble();

		result = weight/(height*height);//<18.5DL >24.9 SOBREPESO >30 OBESIDAD
		
		
		if(result <=18.4 && result >0 ) {
			System.out.println("Desnutricion Leve");
		}
		
		else if(result >24.9 && result <30 ) {
			System.out.println("Sobrepeso");
		}

		else if(result >30 ) {
			System.out.println("Obesidad I");
		}
		
		else if(result >=18.5 && result <=24.9 ) {
			System.out.println("Andas chido");
		}

	}

}
