package pkg;

import java.util.Scanner;

public class Calc_hrs_sommeil {
	
	private int nombreHrsSom = 0;
	
	@Override
	public String toString() {
		String result = "";
		result += nombreHrsSom;
		return result;
	} 
	
	public Calc_hrs_sommeil() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vous voulez proceder a l'enregistrement de vos heures de sommeil...");
		
		System.out.println("Combien d'heures avez-vous dormi la nuit passe?");
		nombreHrsSom = sc.nextInt();
		setNombreHrsSom(nombreHrsSom);
		
		sc.close();
		
	}
	
	private void setNombreHrsSom(int nombreHrsSom) {
		this.nombreHrsSom = nombreHrsSom;
	}
	
}
