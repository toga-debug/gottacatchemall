package org.premiumminds.gottacatchemall;

import org.premiumminds.gottacatchemall.controller.InputController;

import java.util.Scanner;

public class PokemonMap {
    static final String HELLO_MESSAGE = "Bem-vindo ao mundo dos pokemons.";
    static final String CHOOSE_YOUR_WAY_MESSAGE = "Escolha o seu caminho.";
    static final String NUMBER_OF_POKEMONS_MESSAGE = "O numero de pokemons apanhados foram: ";


    public void init() {
        System.out.println(HELLO_MESSAGE);
        inputLoop();
    }

    private void inputLoop() {
        while (true) {
            System.out.println(CHOOSE_YOUR_WAY_MESSAGE);
            String input = inputScanner();
            try {
                System.out.println(NUMBER_OF_POKEMONS_MESSAGE + new InputController().processInput(input));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String inputScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
