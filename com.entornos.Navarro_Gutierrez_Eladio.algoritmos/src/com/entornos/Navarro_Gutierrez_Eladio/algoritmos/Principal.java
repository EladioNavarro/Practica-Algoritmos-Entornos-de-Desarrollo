package com.entornos.Navarro_Gutierrez_Eladio.algoritmos;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = generarNumerosUnicos(3, 2, 10);
        int[] resultadoFibonacci = new int[3];
        int[] resultadoFactorial = new int[3];
        boolean[] resultadoPrimos = new boolean[3];

        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
            resultadoPrimos[i] = Algoritmos.primo(numeros[i]);
        }

       
    }

    private static int[] generarNumerosUnicos(int cantidad, int min, int max) {
        java.util.Random rand = new java.util.Random();
        int[] resultado = new int[cantidad];
        java.util.HashSet<Integer> numerosUsados = new java.util.HashSet<>();

        int index = 0;
        while (index < cantidad) {
            int num = rand.nextInt(max - min + 1) + min;
            if (!numerosUsados.contains(num)) {
                numerosUsados.add(num);
                resultado[index++] = num;
            }
        }
        return resultado;
    }
}

