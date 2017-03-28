package com.intellizoo.virtualzoo;

import com.intellizoo.virtualzoo.zoo.Zoo;
import com.intellizoo.virtualzoo.zoo.controller.Controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

  private static final String INPUT_FILE = "zoo.txt";

  public static void main(String args[]) {
    File inputFile = new File(INPUT_FILE);
    Zoo zoo;

    try {
      Scanner scanner = new Scanner(inputFile);
      zoo = new Zoo(scanner);

      Controller controller = new Controller(zoo, true);
      controller.displayMenu();

      scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
