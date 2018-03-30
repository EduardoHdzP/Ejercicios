package objetos;

import java.util.Scanner;

public class Principal {
	private static Cuadrado cuadrado;
	private static Cubo cubo;


	public static void main(String[] args) {
		System.out.println("Programa de objetos\n");
		inicio();	
	}
	
	public static void inicio() {
		float valor;
		try {
			System.out.print("\nIngrese un valor: ");
			valor=new Scanner(System.in).nextFloat();
			hacerOperaciones(valor);
		} catch (Exception e) {
			System.out.println("Entrada no valida\n");
			inicio();
		}
		
	}
	public static void hacerOperaciones(float valor) {
		int operacion;
		String menu="\nMENÚ OPERACIONES\n";
		menu+="Valor actual: "+valor+"\n";
		menu+="1.- Calcular área\n";
		menu+="2.- Calcular perímetro\n";
		menu+="3.- Calcular volumen\n";
		menu+="4.- Calcular perímetro\n";
		menu+="5.- Cancelar\n";
		menu+="6.- Salir\n";
		menu+="Elija una opción:";
		System.out.print(menu);
		
		
		try {
			
			operacion=new Scanner(System.in).nextInt();
			if (operacion==1) {
				cuadrado=new Cuadrado(valor);
				System.out.println("\nEl área del cuadrado es: "+cuadrado.calcularArea()+" u2");
				navegacion(valor);
			} else if (operacion==2){
				cuadrado=new Cuadrado(valor);
				System.out.println("\nEl perimetro del cuadrado es: "+cuadrado.calcularPerimetro()+" u");
				navegacion(valor);
			}else if (operacion==3){
				cubo=new Cubo(valor);
				System.out.println("\nEl volumen del cubo es: "+cubo.calcularVolumen()+" u3");
				navegacion(valor);
			}else if (operacion==4){
				cubo=new Cubo(valor);
				System.out.println("\nEl perimetro del cubo es: "+cubo.calcularPerimetro()+" u");
				navegacion(valor);
			}else if (operacion==5){
				inicio();
			}else if (operacion==6){
				System.out.println("<<< Programa finalizado >>>");
			}else {
				System.out.println("La opción no es valida");
				hacerOperaciones(valor);
			}
			
		} catch (Exception e) {
			System.out.println("Entrada no valida\n");
			hacerOperaciones(valor);
		}
		

	}
	public static void navegacion(float valor) {
		System.out.print("Valor actual: "+valor+"\n"
				+ "1.- Ir a menú operaciones\n"
				+ "2.- Ir a inicio\n"
				+ "Elija una opción: ");
		
		try {
			int direccion=new Scanner(System.in).nextInt();
			if (direccion==1) {
		    	hacerOperaciones(valor);
			} else if (direccion==2){
				inicio();
			}else {
				System.out.println("La opción no es valida\n");
				navegacion(valor);
			}
		} catch (Exception e) {
			System.out.println("La entrada no es valida\n");
			navegacion(valor);
		}
		
	}

}
