package com.intellizoo.virtualzoo;

import com.intellizoo.virtualzoo.zoo.animal.aves.Owl;

public class Main {
  public static void main(String args[]) {
    System.out.println("Hello world!");
    System.out.print("2+3=");
    Point P = new Point(5,5);
    Owl animal = new Owl(P, 50, true);
    System.out.println(animal.getDescription());
  }
}
