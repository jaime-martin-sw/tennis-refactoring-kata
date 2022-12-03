package com.smallworldfs.tennis;

import java.util.Optional;

public class Player {
  private PlayerName   playerName;
  private PlayerScore  playerScore = new PlayerScore();

  Player (String name) {
    this.playerName = new PlayerName(name);
  }

  public boolean isNamed(String name) {
    return this.playerName.isEqualTo(name);
  }

  public void wonPoint() {
    playerScore.wonPoint();
  }

  public PlayerName getPlayerName() {
    return playerName;
  }

  public void setPlayerName(PlayerName playerName) {
    this.playerName = playerName;
  }

  public PlayerScore getPlayerScore() {
    return playerScore;
  }

  public void setPlayerScore(PlayerScore playerScore) {
    this.playerScore = playerScore;
  }

  public int compareScoreWith(Player anotherPlayer) {
    return this.playerScore.compareTo(anotherPlayer.getPlayerScore());
  }

  public Optional<EScore> getScoreEnum() {
    return playerScore.getScoreEnum();
  }
}
