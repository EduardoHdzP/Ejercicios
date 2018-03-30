package romanos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Romanos {
	

	public static void main(String[] args) {
		int numero;
		String num;
		String romano;
		int c;
		
		System.out.println("CONVIERTE DECIMAL A ROMANO\nDIGITE UN NUMERO < 1 PARA SALIR\n");
		
		while (true) {
			try {
				System.out.print("Digite el número:");
				numero=new Scanner(System.in).nextInt();
				num=String.valueOf(numero);
				if (numero>0) {
					if (numero<=1000) {
						if (numero==1000) {
							romano="M";
							System.out.println(num +" = "+romano+"\n");
						} else {
							romano="";
							c=num.length()-1;
							for (int i =0 ; i<num.length(); i++) {
								if (c==2) {
									romano+=obtener100Al900(Integer.parseInt(String.valueOf(num.charAt(i))),'C','D','M');
								}else if (c==1) {
									romano+=obtener100Al900(Integer.parseInt(String.valueOf(num.charAt(i))),'X','L','C');
								}else if (c==0) {
									romano+=obtener100Al900(Integer.parseInt(String.valueOf(num.charAt(i))),'I','V','X');
								}
								
								c--;
							}
							System.out.println(num +" = "+romano+"\n");
						}
						
					}else {
						System.out.println("El número esta fuera del rango [1-1000]\n");
					}
					
				}else {
					System.out.println("\nPrograma finalizado");
					break;
				}
				
			} catch (InputMismatchException e) {
				System.out.println("La entrada no es valida\n");
			}
		}

	}

	public static String obtener100Al900(int numero,char base,char intermedio,char basesig) {
		String r="";
		int acumulado=0;
		if (numero==9) {
			r=base+""+basesig;
		}else if(numero/5>=1) {
			r=String.valueOf(intermedio);
			acumulado=5;
			while (acumulado<numero) {
				r+=String.valueOf(base);
				acumulado+=1;
			}
		}else {
			if (numero<=3 && numero>0) {
				r=String.valueOf(base);
				acumulado=1;
				while (acumulado<numero) {
					r+=String.valueOf(base);
					acumulado+=1;
				}
					
			} else if(numero==4){
				r=base+""+intermedio;
			}else {
				r="";
			}
		}
		return r;
	}

}
