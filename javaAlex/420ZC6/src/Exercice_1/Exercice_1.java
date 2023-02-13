package Exercice_1;

import java.util.Scanner;

public class Exercice_1 {

	
	public static String prendreNom() {
		
		System.out.println("Veuillez écrire vote nom : ");
		
		Scanner clavier = new Scanner(System.in);
		
		String texte = clavier.nextLine();
		
		return texte;
		
	}
	
	public static char prendreSexe() {
		
		Scanner clavier = new Scanner(System.in);
		
		char sexe;
		
		do {
			
			System.out.println("Veuillez écrire votre genre (H pour homme et F pour femme)");
			
			sexe = clavier.nextLine().toUpperCase().charAt(0);
			
			if (sexe != 'H' && sexe != 'F') {
				
				System.out.print("Erreur - ");
				
			}
		}while(sexe != 'H' && sexe != 'F');
		
		return sexe;
	}
	
	public static int prendreDate(String moment) {
		Scanner clavier = new Scanner(System.in);
		
		System.out.println(String.format("Veuillez écrire le %s de votre naissance", moment));
		
		int nombre = clavier.nextInt();
		
		return nombre;
	}
	
	public static String messageFin(String nom, int age, char sexe) {
		String reponse;
		final int MOYENNE_FEMME = 84;
		final int MOYENNE_HOMME = 80;
		
		int tempsRestant;
		
		if(sexe == 'H') {
			tempsRestant = MOYENNE_HOMME - age;
		} else {
			tempsRestant = MOYENNE_FEMME - age;
		}
		
		if(tempsRestant < 0) {
			reponse = "Bonjour " + nom + ", vous avez " + tempsRestant + " ans. Bravo, vous avez battu le record de l'esperence de vie quebecoise de " + (tempsRestant * -1) + " ans";
		} else {
			reponse = "Bonjour " + nom + ", vous avez " + age + " ans. Il vous reste " + tempsRestant + " a vivre";
		}
		
		return reponse;
	}
	
	public static void main(String[] args) {

		String message;
		
		final int ANNEE = 2023;

		
		String nom = prendreNom();
		
		char sexe = prendreSexe();
		
		int jour = prendreDate("jour");
		int mois = prendreDate("mois");
		int annee = prendreDate("annee");
		
		int age = ANNEE - annee;
		
		System.out.println(messageFin(nom, age, sexe));
	}

}
