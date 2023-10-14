package apps;

import interfaces.CallService;

public class DefaultPhoneService implements CallService {

  public DefaultPhoneService(String phoneNumber) {
    System.out.println("O seu número atual é: " + phoneNumber);
  }
  @Override
  public void call(String phoneNumber) {
    System.out.println("Ligando para o número: " + phoneNumber);
  }

  @Override
  public void answer() {
    System.out.println("Atendendo a ligação.");
  }

  @Override
  public void recordMessage() {
    System.out.println("Gravando mensagem.");
  }
}
