package com.bridgelabz;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        boardCreation();
    }

    public static void boardCreation() {
        char[] element = new char[10];
        for (int i = 1; i < 10; i++) {
            element[i] = ' ';
        }
        System.out.println("Tic Tac Toe board is ready");
    }
}