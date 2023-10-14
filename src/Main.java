import apps.DefaultPhoneService;
import apps.Safari;
import apps.Youtube;

public class Main {
  public static void main(String[] args) {
    CostumerPhone phone = new CostumerPhone(new DefaultPhoneService("+55 84 987765463"), new Safari(), new Youtube());

    System.out.println("-------------> Testando player: Youtube");
    phone.player.selectTrack("Não há ferrolho");
    phone.player.play();
    phone.player.pause();

    System.out.println("-------------> Testando navegador: Safari");
    phone.safari.openPage();
    phone.safari.openInNewTab();
    phone.safari.refreshPage();

    System.out.println("------------->");
    phone.phoneService.call("+55 84 976345675");
    phone.phoneService.answer();
    phone.phoneService.recordMessage();

    System.out.println("-------------> Finalizando testes!");
  }
}