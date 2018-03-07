/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Arrays;

/**
 *
 * @author leo_e
 */
public class Nivel2 {
    
     public void escaleraPalabras(char[][] _palabras) {

	boolean esEscalera = true;
	boolean errTamaño = false;

	for (int i = 1; i < _palabras.length; i++) {
	    if (_palabras[i].length == _palabras[i - 1].length && !errTamaño) {
		int diff = 0;
		for (int j = 0; j < _palabras[i].length; j++) {
		    if (_palabras[i][j] != _palabras[i - 1][j]) {
			diff++;
		    }
		}
		if (diff > 1) {
		    esEscalera = false;
		}
	    } else if (!errTamaño) {
		errTamaño = true;
	    }
	}
	if (errTamaño) {
	    System.out.println("Las palabras son de distinto tamaño");
	} else if (esEscalera) {
	    for (int i = 0; i < _palabras.length; i++) {
		System.out.println(Arrays.toString(_palabras[i]));
	    }
	    System.out.println("-----------------------------");
	    System.out.println("Es una escalera de palabras.");
	} else {
	    for (int i = 0; i < _palabras.length; i++) {
		System.out.println(Arrays.toString(_palabras[i]));
	    }
	    System.out.println("-----------------------------");
	    System.out.println("No es una escalera de palabras.");
	}

    }
     
     ///////////////////////////////////////////////////////////////////////////
     ///////////////////////////////////////////////////////////////////////////
     ///////////////////////////////////////////////////////////////////////////
     ///////////////////////////////////////////////////////////////////////////
     ///////////////////////////////////////////////////////////////////////////
     
      public int costeErroresADN(String uno, String dos) {
	int errores = 0;
	if (uno.length() == dos.length()) {
	    for (int i = 0; i < uno.length(); i++) {
		errores += comparaNucleotidos(uno.charAt(i), dos.charAt(i));
	    }
	}
	return errores;
    }
      
      
      public int comparaNucleotidos(char uno, char dos) {
	int error = 0;

	//Comprobamos si los Nucleotidos son iguales
	if (uno == dos) {
	    error++;
	}

	//Transforma las T en A de uno
	if (uno == 'T') {
	    uno = 'A';
	} else if (uno == 'G') {
	    uno = 'C';
	}

	//Transforma las T en A de dos
	if (dos == 'T') {
	    dos = 'A';
	} else if (dos == 'G') {
	    dos = 'C';
	}

	//Comprobamos si los Nucleotidos son distintos despues de la transformacion
	if (uno != dos) {
	    if (uno == '-') {
		error += 2;
	    } else if (dos == '-') {
		error += 2;
	    } else {
		error++;
	    }
	}

	return error;
    }

    
}
