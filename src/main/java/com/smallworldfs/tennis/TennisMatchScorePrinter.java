package com.smallworldfs.tennis;

public class TennisMatchScorePrinter {
  public static final String DEUCE = "Deuce";
  public static final String ADVANTAGE = "Advantage ";
  public static final String WIN = "Win for ";
  public static final String ALL = "All";

  private TennisMatchScorePrinter(){}

  public static String getUnfinishedMatchResult(Player player1, Player player2) throws IllegalArgumentException {
    if (player1.getScoreEnum().isPresent() && player2.getScoreEnum().isPresent()) {
      return player1.getScoreEnum().get() + "-" + player2.getScoreEnum().get();
    }
    throw new IllegalArgumentException();
  }

  public static String getTieResult(Player player1) throws IllegalArgumentException {
    if (player1.getScoreEnum().isPresent())
      return player1.getScoreEnum().get() + "-" + ALL;
    throw new IllegalArgumentException();
  }

  public static String getAdvantageResult(Player player1, Player player2) {
    if (player1.compareScoreWith(player2) > 0) {
      return ADVANTAGE + player1.getPlayerName();
    }
    return ADVANTAGE + player2.getPlayerName();
  }

  public static String getWinnerResult(Player player1, Player player2) {
    if (player1.compareScoreWith(player2) > 0) {
      return WIN + player1.getPlayerName();
    }
    return WIN + player2.getPlayerName();
  }
}
