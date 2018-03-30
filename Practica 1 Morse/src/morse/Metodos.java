package morse;


public class Metodos {
	public static String retornaCaracteresMorse(char c) {
		String codigoMorse="";
		switch (c) {
		case 'A':
			codigoMorse=".-";
			break;
		case 'B':
			codigoMorse="-...";
			break;
		case 'C':
			codigoMorse="-.-.";
			break;
		case 'D':
			codigoMorse="-..";
			break;
		case 'E':
			codigoMorse=".";
			break;
		case 'F':
			codigoMorse="..-.";
			break;
		case 'G':
			codigoMorse="--.";
			break;
		case 'H':
			codigoMorse="....";
			break;
		case 'I':
			codigoMorse="..";
			break;
		case 'J':
			codigoMorse=".---";
			break;
		case 'K':
			codigoMorse="-.-";
			break;
		case 'L':
			codigoMorse=".-..";
			break;
		case 'M':
			codigoMorse="--";
			break;
		case 'N':
			codigoMorse="-.";
			break;
		case 'O':
			codigoMorse="---";
			break;
		case 'P':
			codigoMorse=".--.";
			break;
		case 'Q':
			codigoMorse="--.-";
			break;
		case 'R':
			codigoMorse=".-.";
			break;
		case 'S':
			codigoMorse="...";
			break;
		case 'T':
			codigoMorse="-";
			break;
		case 'U':
			codigoMorse="..-";
			break;
		case 'V':
			codigoMorse="...-";
			break;
		case 'W':
			codigoMorse=".--";
			break;
		case 'X':
			codigoMorse="-..-";
			break;
		case 'Y':
			codigoMorse="-.--";
			break;
		case 'Z':
			codigoMorse="--..";
			break;
		case '1':
			codigoMorse=".----";
			break;
		case '2':
			codigoMorse="..---";
			break;
		case '3':
			codigoMorse="...--";
			break;
		case '4':
			codigoMorse="....-";
			break;
		case '5':
			codigoMorse=".....";
			break;
		case '6':
			codigoMorse="-....";
			break;
		case '7':
			codigoMorse="--...";
			break;
		case '8':
			codigoMorse="---..";
			break;
		case '9':
			codigoMorse="----.";
			break;
		case '0':
			codigoMorse="-----";
			break;
		}
		return codigoMorse;
	}
	
	
	
	
	public static char retornaCaracteres(String s) {
		char caracter = 0;
		
		switch (s) {
		case ".-":
			caracter='A';
			break;
		case "-...":
			caracter='B';
			break;
		case "-.-.":
			caracter='C';
			break;
		case "-..":
			caracter='D';
			break;
		case ".":
			caracter='E';
			break;
		case "..-.":
			caracter='F';
			break;
		case "--.":
			caracter='G';
			break;
		case "....":
			caracter='H';
			break;
		case "..":
			caracter='I';
			break;
		case ".---":
			caracter='J';
			break;
		case "-.-":
			caracter='K';
			break;
		case ".-..":
			caracter='L';
			break;
		case "--":
			caracter='M';
			break;
		case "-.":
			caracter='N';
			break;
		case "---":
			caracter='O';
			break;
		case ".--.":
			caracter='P';
			break;
		case "--.-":
			caracter='Q';
			break;
		case ".-.":
			caracter='R';
			break;
		case "...":
			caracter='S';
			break;
		case "-":
			caracter='T';
			break;
		case "..-":
			caracter='U';
			break;
		case "...-":
			caracter='V';
			break;
		case ".--":
			caracter='W';
			break;
		case "-..-":
			caracter='X';
			break;
		case "-.--":
			caracter='Y';
			break;
		case "--..":
			caracter='Z';
			break;
		case ".----":
			caracter='1';
			break;
		case "..---":
			caracter='2';
			break;
		case "...--":
			caracter='3';
			break;
		case "....-":
			caracter='4';
			break;
		case ".....":
			caracter='5';
			break;
		case "-....":
			caracter='6';
			break;
		case "--...":
			caracter='7';
			break;
		case "---..":
			caracter='8';
			break;
		case "----.":
			caracter='9';
			break;
		case "-----":
			caracter='0';
			break;
		}
		return caracter;	
	}
	
	public static boolean esMorse(String entrada) {
		boolean b=true;
		for (int i = 0; i < entrada.length(); i++) {
			if (entrada.charAt(i)!=' ' && entrada.charAt(i)!='.' && entrada.charAt(i)!='-') {
				b=false;
				break;
			}
		}
		return b;
	}

	public static boolean esTexto(String entrada) {
		boolean b=true;
		for (int i = 0; i < entrada.length(); i++) {
			if (!Character.isAlphabetic(entrada.charAt(i)) && !Character.isDigit(entrada.charAt(i)) && entrada.charAt(i)!=' ') {
				b=false;
				break;
			}
		}
		return b;
	}

}
