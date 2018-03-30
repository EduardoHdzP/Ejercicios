package morse;


import java.util.Scanner;
import static morse.Metodos.*;


public class MorsePrincipal {

	public static void main(String[] args) {
		String salida="";
		String entrada="";
		Scanner texto=new Scanner(System.in);
		System.out.println("BIENVENIDO\nDIGITE:<-- PARA SALIR\n");
		
		while (true) {
			System.out.print("Entrada: ");	
			entrada=texto.nextLine();
			if (!entrada.equals("<--")) {
				if (esTexto(entrada)) {
					salida="";
					entrada=entrada.replace(" ", "  ");
					entrada=entrada.toUpperCase();
					for (int i = 0; i < entrada.length(); i++) {
						salida+="\0"+retornaCaracteresMorse(entrada.charAt(i));
					}
					
					System.out.println("Salida: "+salida+"\n");
					
				}else if(esMorse(entrada)) {
					salida="";
					entrada=entrada.replace("   ", "  ");					
					entrada=entrada.toUpperCase();
					String cadenas[]=entrada.split(" ");
					
					
					for (String morse : cadenas) {
						salida+=retornaCaracteres(morse);
					}
					System.out.println("Salida : "+salida+"\n");
					
				}else {
					System.out.println("El texto de entrada no es valido\n");
				}
				
			}else {
				System.out.println("El programa ha sido finalizado!!");
				texto.close();
				break;
			}
		}

	}
}
