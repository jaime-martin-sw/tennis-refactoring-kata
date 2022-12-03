package com.smallworldfs.tennis;

import java.util.Optional;

public class PlayerScore {


  private int score;

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void wonPoint() {
    score++;
  }

  public int compareTo(PlayerScore anotherPlayerScore) {
    return this.score - anotherPlayerScore.getScore();
  }

  public boolean isAdvantage(PlayerScore anotherPlayerScore) {
    return Math.abs(this.getScore() - anotherPlayerScore.getScore()) == 1;
  }

  public boolean isHigherThanThirty() {
    return this.getScore() > EScore.THIRTY.getPoint();
  }

  public Optional<EScore> getScoreEnum() {
    return EScore.getScoreFromPoint(this.getScore());
  }
}
