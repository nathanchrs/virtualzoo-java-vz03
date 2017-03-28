package com.intellizoo.virtualzoo;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import com.intellizoo.virtualzoo.ui.MainForm;
import com.intellizoo.virtualzoo.zoo.Zoo;
import javax.swing.JFrame;

public class Main {

  /**
   * Program utama.
   *
   * @param args argumen tambahan saat menjalankan program.
   */
  public static void main(String[] args) {
    Zoo zoo = new Zoo(10, 10);

    JFrame frame = new JFrame("Virtual Zoo");
    MainForm mainForm = new MainForm();
    mainForm.setZoo(zoo);
    frame.setContentPane(mainForm.getMainPanel());
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
