package desafio;

import static utils.Utils.AutoFillEmails;
import static utils.Utils.AutoFillItems;

import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public final class App {
  /**
   * Says hello to the world.
   * 
   * @param args The arguments of the program.
   */
  public static void main(String[] args) {

    Challenge challenge = new Challenge();
    List<String> emails = AutoFillEmails(5);
    List<Item> items = AutoFillItems(23);

    Map<String, Integer> response = challenge.calculate(items, emails);

    for (Map.Entry<String, Integer> entry : response.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue().toString());
    }

  }
}
