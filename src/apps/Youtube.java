package apps;

import interfaces.Player;

public class Youtube implements Player {
  private String trackName = "Track 1";

  @Override
  public void play() {
    if (this.trackName == null) {
      System.out.println("Nenhuma trilha foi selecionada.");
      return;
    }

    System.out.println("A trilha: " + this.trackName + " foi iniciada.");
  }

  @Override
  public void pause() {
    System.out.println("A trilha: " + this.trackName + " foi pausada.");
  }

  @Override
  public void selectTrack(String trackName) {
    this.trackName = trackName;
    System.out.println("A trilha: " + trackName + " foi selecionada.");
  }
}
