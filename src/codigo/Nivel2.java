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
	    System.out.println("");
	    System.out.println("Es una escalera de palabras.");
	} else {
	    for (int i = 0; i < _palabras.length; i++) {
		System.out.println(Arrays.toString(_palabras[i]));
	    }
	    System.out.println("");
	    System.out.println("No es una escalera de palabras.");
	}

    }
}
