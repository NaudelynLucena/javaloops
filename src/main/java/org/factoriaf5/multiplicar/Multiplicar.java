package org.factoriaf5.multiplicar;

public class Multiplicar {

        public void multiplicar(int n) {
            for (int i = 1; i <= 10; i++) {
                int resultado = n * i;
                System.out.println(n + " x " + i + " = " + resultado);
            }
        }

        public static void main(String[] args) {
            Multiplicar multiplicar = new Multiplicar();
            multiplicar.multiplicar(5);
        }
    }