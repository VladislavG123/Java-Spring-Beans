package com.example.demo;

public class GameManager {
    private Gameable game;

    public GameManager(Gameable game) {
        this.game = game;
    }

    public String playGame() {
        return "Game Manager has started game\n" + game.play();
    }
}
