package com.example.project;

public class Main {
    public static void main(String[] args) {
        Fibonacci[] fibonaccis = new Fibonacci[3];
        fibonaccis[0] = new Fibonacci(5);
        fibonaccis[1] = new Fibonacci(11);
        fibonaccis[2] = new Fibonacci(20);
        for (Fibonacci fibonacci : fibonaccis) {
            System.out.println(fibonacci.getSequence().length);
        }
    }
}
