package app;

public class Exercicio_05 {
	
	    public static void main(String[] args) {
	        String str = "Pedro Fortuna";
	        char[] charArray = new char[str.length()];

	        
	        for (int i = str.length() - 1; i >= 0; i--) {
	            charArray[str.length() - i - 1] = str.charAt(i);
	        }

	      
	        String strInvertida = new String(charArray);

	        System.out.println("String original: " + str);
	        System.out.println("String invertida: " + strInvertida);
	    }
	}


