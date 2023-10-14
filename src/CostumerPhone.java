import interfaces.Browser;
import interfaces.CallService;
import interfaces.Player;

public class CostumerPhone {
  CallService phoneService;
  Browser safari;
  Player player;

  public CostumerPhone(CallService phoneService, Browser safari, Player player) {
    this.phoneService = phoneService;
    this.safari = safari;
    this.player = player;
  }
}
