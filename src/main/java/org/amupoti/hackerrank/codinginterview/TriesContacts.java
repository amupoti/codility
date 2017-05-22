package org.amupoti.hackerrank.codinginterview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TriesContacts {

  private Set<String> contacts = new HashSet<>();

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    TriesContacts contacts = new TriesContacts();
    for (int a0 = 0; a0 < n; a0++) {
      String op = in.next();
      String contact = in.next();
      if (op.equals("add"))
        contacts.addContact(contact);
      else
        System.out.println(contacts.occurrences(contact));

    }
  }

  public long performOp(String op, String contact) {

    switch (op) {
    case "add": {
      addContact(contact);
      return -1;
    }
    case "find":
      return occurrences(contact);
    default:
      return -1;
    }
  }

  //TODO: implement Trie
  private long occurrences(String contact) {
    return contacts.parallelStream().filter(c -> c.startsWith(contact)).count();
  }

  private void addContact(String contact) {
    contacts.add(contact);
  }
}
