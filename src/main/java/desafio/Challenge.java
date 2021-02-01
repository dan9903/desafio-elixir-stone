package desafio;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Challenge {

  public Map<String, Integer> calculate(List<Item> items, List<String> emails) {
    Map<String, Integer> response = new HashMap<String, Integer>();
    if (!items.isEmpty() && !emails.isEmpty()) {
      Integer allItemsSum = sumAllItems(items);
      Map<Integer, Integer> bills = divideForEmails(allItemsSum, emails.size());
      response = parserEmailValue(bills, emails);
    }

    return response;
  }

  public Integer sumAllItems(List<Item> items) {
    Integer total = 0;
    for (Item item : items) {
      total += (item.getUnitaryPrice() * item.getQuantity());
    }
    return total;
  }

  public Map<Integer, Integer> divideForEmails(Integer total, Integer quantityOfEmails) {
    // billVaule, quantityOfEmails
    Map<Integer, Integer> bills = new LinkedHashMap<Integer, Integer>();
    Integer individualValue = total / quantityOfEmails;
    bills.put(individualValue, quantityOfEmails);
    Integer validate = individualValue * quantityOfEmails;

    if (validate != total) {
      Integer quantityOfEmails2 = quantityOfEmails - (total - validate);
      bills.replace(individualValue, quantityOfEmails2);
      bills.put(++individualValue, (quantityOfEmails - quantityOfEmails2));
    }
    return bills;
  }

  public Map<String, Integer> parserEmailValue(Map<Integer, Integer> bills, List<String> emails) {
    Map<String, Integer> response = new HashMap<String, Integer>();

    Iterator<Entry<Integer, Integer>> it = bills.entrySet().iterator();
    Integer value = it.next().getKey();
    Integer quantityEmails = bills.get(value);

    for (int i = 0; i < quantityEmails; i++) {
      response.put(emails.get(i), value);
    }
    if (it.hasNext()) {
      value = it.next().getKey();
      for (int i = quantityEmails; i < emails.size(); i++) {
        response.put(emails.get(i), value);
      }
    }

    return response;
  }
}