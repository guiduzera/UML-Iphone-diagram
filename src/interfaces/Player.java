package interfaces;

public interface Player {
  String trackName = "Track 1";
  String login = "admin";
  String password = "admin123";
  void play();
  void pause();
  void selectTrack(String trackName);
}
