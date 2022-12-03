package com.smallworldfs.tennis;

import java.util.Arrays;
import java.util.Optional;

public enum EScore {
  LOVE(0, "Love"),
  FIFTEEN(1, "Fifteen"),
  THIRTY(2, "Thirty"),
  FORTY(3, "Forty");

  int point;
  String pointStr;

  EScore(int point, String pointStr) {
    this.point = point;
    this.pointStr = pointStr;
  }

  public int getPoint() {
    return point;
  }

  public static Optional<EScore> getScoreFromPoint(int point) {
    return Arrays.stream(EScore.values()).filter(s -> s.point == point).findFirst();
  }

  @Override
  public String toString() {
    return pointStr;
  }
}


