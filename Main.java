package pkg;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
	
	
	private void writeFile() throws IOException {
		FileOutputStream fileOutputStream = null;
		
		try {
			nowObject maintenant = new nowObject();
			Calc_hrs_sommeil calcul = new Calc_hrs_sommeil();
			fileOutputStream = new FileOutputStream("hrsSommeil.txt", true);
			String line = maintenant.toString() + " --> " + calcul.toString() + "heures.";
			String result = line + "\n";
			byte[] byteArray = result.getBytes();
			
			fileOutputStream.write(byteArray);
			System.out.println("Success. Written to the file. hrsSommeil.txt");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(fileOutputStream != null) {
				fileOutputStream.close();
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue dans le programme.");


		// Question1
		System.out.println("Voulez-vous enregistrer votre nombre d'heures de sommeil de la nuit derniere(o/n)?");
		String answer = sc.next();

		switch(answer) {
		case "o":
			Main fileOutputStream = new Main();
			fileOutputStream.writeFile();
			sc.close();
			break;

		case "n":
			sc.close();
			System.exit(0);
			break;	

		
		}
		

	}

}
