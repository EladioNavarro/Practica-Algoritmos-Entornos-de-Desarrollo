package com.entornos.Navarro_Gutierrez_Eladio.algoritmos;

public abstract class Algoritmos {

public int fibonacci(int numero) {
    if (numero < 0) {
        throw new IllegalArgumentException("El número no puede ser menor que cero.");
    }
    if (numero == 0) return 0;
    if (numero == 1) return 1;

    int a = 0, b = 1, resultado = 0;
    for (int i = 2; i <= numero; i++) {
        resultado = a + b;
        a = b;
        b = resultado;
    }
    return resultado;
}

public int factorial(int numero) {
    if (numero < 0) {
        throw new IllegalArgumentException("El número no puede ser menor que cero.");
    }
    long resultado = 1;
    for (int i = 2; i <= numero; i++) {
        resultado *= i;
    }
    return (int) resultado;
}

public boolean primo(int numero) {
    if (numero < 2) {
        throw new IllegalArgumentException("El número debe ser mayor o igual a 2.");
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
	}
}