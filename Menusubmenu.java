package es.fempa.dam.programacionjava;

import java.util.Scanner;

public class Menusubmenu {
	
	//static Scanner sc; //Variable global
	
	public static void mostrarsubmenu( Scanner tipoDato) {
		
		//Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		int opcion;
		
		do {
			System.out.println("Elige una de las 4 opciones del submenú");
			System.out.println("1. Reservar ");
			System.out.println("2. Devoluciones");
			System.out.println("3. Preguntas frecuentes");
			System.out.println("4. Cerrar sesión");
			opcion = tipoDato.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Reservar");
				break;
			case 2:
				System.out.println("Devoluciones");
				break;
			case 3: 
				System.out.println("Preguntas frecuentes");
				break;
			case 4: 
				System.out.println("Sesión cerrada");
				continuar = false;
				break;
			}
		}while (continuar);
			//tipoDato.close();
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		int opcion;
		
		do {
			System.out.println("Elige una opción: ");
			System.out.println("1. Abrir programa");
			System.out.println("2. Cerrar programa");
			System.out.println("3. Guardar");
			System.out.println("4. Submenú");
			System.out.println("5. Salir");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Abrir");
				break;
			case 2:
				System.out.println("Cerrar");
				break;
			case 3:
				System.out.println("Guardar");
				break;
			case 4:
				mostrarsubmenu(sc);
				break;
			case 5:
				System.out.println("Salir");
				continuar = false;
				break;
			}
		}while (continuar);
		sc.close();
	}//Fin main

}//Fin clase Menussubmenu
