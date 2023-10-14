package apps;

import interfaces.Browser;

public class Safari implements Browser {
  @Override
  public void openPage() {
    System.out.println("A página: " + pageName + " foi aberta.");
  }

  @Override
  public void openInNewTab() {
    System.out.println("A página: " + pageName + " foi aberta em uma nova aba.");
  }

  @Override
  public void refreshPage() {
    System.out.println("A página: " + pageName + " foi atualizada.");
  }
}
