package com.smallworldfs.tennis;

public class PlayerName {
  private String name;

  public PlayerName(String name) {
    this.name = name;
  }

  public boolean isEqualTo(String name) {
    return this.name.equals(name);
  }

  public String toString() {
    return name;
  }
}
