package utils;

import java.util.ArrayList;
import java.util.List;

import desafio.Item;

public class Utils {

  public static List<String> AutoFillEmails(Integer quantity) {
    List<String> emailsList = new ArrayList<String>();
    List<String> response = new ArrayList<>();

    emailsList.add("mohamedmohsen00s@nunyc.com");
    emailsList.add("aedi.ks6@maliberty.com");
    emailsList.add("onassr@mandalajp.net");
    emailsList.add("tanass.rajawi.396@gurpz.com");
    emailsList.add("sadnan@amrous.ga");

    for (int i = 0; i < quantity; i++) {
      response.add(emailsList.get(i));
    }

    return response;
  }

  public static List<Item> AutoFillItems(Integer quantity) {
    List<Item> itemsList = new ArrayList<Item>();
    List<Item> response = new ArrayList<Item>();

    itemsList.add(new Item("alvejante", 500, 1)); // 500
    itemsList.add(new Item("Achocolatado", 500, 2)); // 1000
    itemsList.add(new Item("Baunilha", 900, 1)); // 900
    itemsList.add(new Item("Bacon", 1500, 1)); // 1500
    itemsList.add(new Item("Suco de uva", 499, 3)); // 1497
    itemsList.add(new Item("Carne Bovina", 1800, 2)); // 3600
    itemsList.add(new Item("Carne de Frango", 1000, 3)); // 3000
    itemsList.add(new Item("Margarina", 500, 2)); // 1000
    itemsList.add(new Item("Pao", 699, 1)); // 699
    itemsList.add(new Item("Presunto", 999, 1)); // 999
    itemsList.add(new Item("Queijo", 2400, 1)); // 2400
    itemsList.add(new Item("Abacate", 150, 3)); // 450
    itemsList.add(new Item("Banana", 100, 12)); // 1200
    itemsList.add(new Item("Beterraba", 120, 3)); // 360
    itemsList.add(new Item("Couve", 530, 1)); // 530
    itemsList.add(new Item("Laranja", 50, 12)); // 600
    itemsList.add(new Item("Pimentao", 130, 2)); // 260
    itemsList.add(new Item("Salsinha", 30, 12)); // 360
    itemsList.add(new Item("Torta", 3500, 1)); // 3500
    itemsList.add(new Item("Alcool", 600, 2)); // 1200
    itemsList.add(new Item("Cafe", 601, 2)); // 1202
    itemsList.add(new Item("Vassoura", 1800, 1)); // 1200
    itemsList.add(new Item("Inseticida", 1500, 1)); // 1500

    // total = 30057
    for (int i = 0; i < quantity; i++) {
      response.add(itemsList.get(i));
    }

    return response;
  }
}