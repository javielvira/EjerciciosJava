/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Arrays;

/**
 *
 * @author Javi Elvira
 */
public class Nivel1 {
    
    public int[] Maximo(int [] listaNumeros){
        int [] numerosMaximos = {0, 0};
        
        for(int i=0; i < listaNumeros.length; i++){
            if(numerosMaximos[0] < listaNumeros[i]){
                numerosMaximos[1] = numerosMaximos[0];
                numerosMaximos[0] = listaNumeros[i];
            }
            else if (numerosMaximos[1] < listaNumeros[i]){
                numerosMaximos[1] = listaNumeros[i];
            }
        }
        return numerosMaximos;
    }
    
    public String Palindromo(String Frase) {
	boolean palindromo = true;

	Frase = Frase.replaceAll("Á", "A");
	Frase = Frase.replaceAll("É", "E");
	Frase = Frase.replaceAll("Í", "I");
	Frase = Frase.replaceAll("Ó", "O");
	Frase = Frase.replaceAll("Ú", "U");
	Frase = Frase.replaceAll("Ñ", "n");
	Frase = Frase.replaceAll("\\W", "");

	for (int i = 0; i < Frase.length() / 2; i++) {
	    if (Frase.charAt(i) == Frase.charAt(Frase.length() - i - 1)) {
	    } else {
		palindromo = false;
	    }
	}

	//Te dice si es un palíndromo
	if (palindromo) {
	    return "Palindromo ok";
	} else {
	    return "No palíndromo";
	}
    }

    public String Isograma(String Frase) {
	boolean isograma = true;

	Frase = Frase.replaceAll("Á", "A");
	Frase = Frase.replaceAll("É", "E");
	Frase = Frase.replaceAll("Í", "I");
	Frase = Frase.replaceAll("Ó", "O");
	Frase = Frase.replaceAll("Ú", "U");
	Frase = Frase.replaceAll("Ñ", "n");
	Frase = Frase.replaceAll("\\W", "");

	for (int i = 0; i < Frase.length(); i++) {
	    for (int j = 0; j < Frase.length(); j++) {
		if (Frase.charAt(i) != Frase.charAt(j) || i == j) {
		} else {
		    isograma = false;
		}
	    }
	}
        
        //Te dice si es un isograma
	if (isograma) {
	    return "Isograma ok";
	} else {
	    return "No isograma";
	}
    }
    
    public void Calendario(int diaSemana) {
	int filas = 5;
	int contador = 0;
	int contador2 = 0;
	String diaNulo = "XX";
        //Si la semana empieza despues de la resaca del jueves de pacha
	if (diaSemana >= 5) {
	    filas = 6;
	}
	String[] calendario = new String[filas * 7];

	//XX a los dias de antes de que empiece el mes
	for (int i = 0; i <= diaSemana - 2; i++) {
	    calendario[contador] = diaNulo;
	    contador++;
	}

	//Asigna numeros a los dias
	for (int j = 1; j < 32; j++) {
	    String aux = Integer.toString(j);
	    if (j <= 9) {
		aux = "0" + aux;
	    }
	    calendario[contador] = aux;
	    contador++;
	}

	//XX a los dias despues de que acabe el mes
	while (contador < calendario.length) {
	    calendario[contador] = diaNulo;
	    contador++;
	}

	//Imprime la tabla
	for (int l = 0; l < filas; l++) {
	    for (int k = 1; k < 7; k++) {
		System.out.print(calendario[contador2] + " ");
		contador2++;
	    }
	    System.out.print(calendario[contador2] + " ");
	    System.out.println();
	    contador2++;
	}
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nivel1 ejercicio1 = new Nivel1();

//        int[] listaNumeros = {50, 31, 27, 2, 5, 99};
//        int[] listaNumeros2 = {150, 31, 27, 2, 5, 99};
//        System.out.println(Arrays.toString(ejercicio1.Maximo(listaNumeros)));
//        System.out.println(Arrays.toString(ejercicio1.Maximo(listaNumeros2)));

//        String palindromo = "ANA";
//        String palindromo2 = "ACASO HUBO BUHOS ACA";
//        String palindromo3 = "PENE";
//        System.out.println(ejercicio1.Palindromo(palindromo));
//        System.out.println(ejercicio1.Palindromo(palindromo2));
//        System.out.println(ejercicio1.Palindromo(palindromo3));

//        String isograma  = "HOLA";
//        String isograma2 = "JAVI";
//        String isograma3 = "PENE";
//        System.out.println(ejercicio1.Isograma(isograma));
//        System.out.println(ejercicio1.Isograma(isograma2));
//        System.out.println(ejercicio1.Isograma(isograma3));

//        ejercicio1.Calendario(3);
//        System.out.println("");
}
}
