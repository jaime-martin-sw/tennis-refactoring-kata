package com.smallworldfs.tennis;

public class TennisGame {

    Player player1;
    Player player2;
    PlayerScoreProcesor playerScoreProcesor;

    public TennisGame(String player1Name, String player2Name) {
        this.player1 = new Player("player1");
        this.player2 = new Player("player2");

        playerScoreProcesor = new PlayerScoreProcesor(player1, player2);

        System.out.println("DEBUG: GAME START" );
    }

    public String getScore() {
        try {
            return playerScoreProcesor.processScores();
        } catch (Exception e) {
            System.out.println("Unexpected error");
        }
        return "Unexpected Error";
    }

    public void wonPoint(String playerNameStr) {
        if (player1.isNamed(playerNameStr)) {
            player1.wonPoint();
            System.out.println("DEBUG: " + playerScoreProcesor.processScores());
            return;
        }
        player2.wonPoint();
        System.out.println("DEBUG: " + playerScoreProcesor.processScores());
    }
}
