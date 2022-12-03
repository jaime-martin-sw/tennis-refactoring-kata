package com.smallworldfs.tennis;

public class PlayerScoreProcesor {
  private Player player1;
  private Player player2;

  PlayerScoreProcesor (Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public String processScores() throws IllegalArgumentException {
    int compare = this.player1.compareScoreWith(this.player2);
    if (compare == 0) {
      return processtTie();
    }

    return processNotTie();
  }

  private String processtTie() throws IllegalArgumentException {
    if (player1.getPlayerScore().isHigherThanThirty()) {
      return TennisMatchScorePrinter.DEUCE;
    }

    return TennisMatchScorePrinter.getTieResult(player1);
  }

  private String processNotTie() throws IllegalArgumentException {
    if (isPossibleToFinishTennisMatch()) {
      return processFinishableTennisMatch();
    }

    return TennisMatchScorePrinter.getUnfinishedMatchResult(player1, player2);
  }

  private boolean isPossibleToFinishTennisMatch() {
    return !(player1.getScoreEnum().isPresent() && player2.getScoreEnum().isPresent());
  }

  private String processFinishableTennisMatch() throws IllegalArgumentException {
    if (player1.getPlayerScore().isAdvantage(player2.getPlayerScore())) {
      return TennisMatchScorePrinter.getAdvantageResult(player1, player2);
    }

    return TennisMatchScorePrinter.getWinnerResult(player1, player2);
  }
}

