package desafio;

import static java.util.stream.Collectors.toMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.Utils.AutoFillEmails;
import static utils.Utils.AutoFillItems;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class ChallengeTest {

  private Challenge challenge;
  private List<String> emails;
  private List<Item> items;

  public ChallengeTest() {
    challenge = new Challenge();
    emails = AutoFillEmails(5);
    items = AutoFillItems(23);
  }

  @Test
  void testSumAllItems() {
    int total = 30057;
    assertEquals(total, challenge.sumAllItems(items));
  }

  @Test
  void testDivideForEmails() {
    Integer total = 30057;
    Integer quantityOfEmails = emails.size();
    Map<Integer, Integer> bills = new LinkedHashMap<Integer, Integer>();
    bills.put(6011, 3);
    bills.put(6012, 2);

    assertEquals(bills, challenge.divideForEmails(total, quantityOfEmails));
  }

  @Test
  void testParsedItemsForEmails() {
    Map<Integer, Integer> bills = new LinkedHashMap<Integer, Integer>();
    bills.put(6011, 3);
    bills.put(6012, 2);
    Map<String, Integer> response = new LinkedHashMap<String, Integer>();
    for (String email : emails) {
      response.put(email, 6011);
    }

    response.replace("tanass.rajawi.396@gurpz.com", 6012);
    response.replace("sadnan@amrous.ga", 6012);

    assertEquals(response, challenge.parserEmailValue(bills, emails));
  }

  @Test
  void TestCalculate() {
    Map<String, Integer> response = Stream
        .of(new AbstractMap.SimpleEntry<>("onassr@mandalajp.net", 6011),
            new AbstractMap.SimpleEntry<>("aedi.ks6@maliberty.com", 6011),
            new AbstractMap.SimpleEntry<>("mohamedmohsen00s@nunyc.com", 6011),
            new AbstractMap.SimpleEntry<>("sadnan@amrous.ga", 6012),
            new AbstractMap.SimpleEntry<>("tanass.rajawi.396@gurpz.com", 6012))
        .collect(toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
    assertEquals(response, challenge.calculate(items, emails));
  }
}