package classGrader;

import java.util.Scanner;

public class ClassGrader {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		int qualStudent; //Variable que guardara la calificacion del alumno
		
		System.out.print("Enter your grade of 0 - 10: ");
		qualStudent = enter.nextInt();
		
		if(qualStudent>=0 && qualStudent<11) {
			if(qualStudent<3) {
				System.out.println("Failed");
			}else if(qualStudent>2 && qualStudent<6) {
				System.out.println("Insufficient");
			}else if(qualStudent>4 && qualStudent<9) {
				System.out.println("Good");
			}else if(qualStudent==10||qualStudent==9) {
				System.out.println("Excellent Grade");
			}
		}else {
			System.out.println("Error");
		}

	}

}
