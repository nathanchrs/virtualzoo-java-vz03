package com.intellizoo.virtualzoo;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import com.intellizoo.virtualzoo.ui.MainForm;
import com.intellizoo.virtualzoo.zoo.Zoo;
import com.intellizoo.virtualzoo.zoo.Zoo.CageNotFoundException;
import com.intellizoo.virtualzoo.zoo.Zoo.HabitatMismatchException;
import com.intellizoo.virtualzoo.zoo.Zoo.ZoneAlreadyExistsException;
import com.intellizoo.virtualzoo.zoo.zone.Cage.CageFullException;
import com.intellizoo.virtualzoo.zoo.zone.Cage.CageHasPreyOrPredatorException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFrame;

public class Main {

  private static final String INPUT_FILE = "zoo.txt";

  /**
   * Program utama.
   *
   * @param args argumen tambahan saat menjalankan program.
   */
  public static void main(String[] args) {
    File inputFile = new File(INPUT_FILE);
    Zoo zoo = null;

    try {
      Scanner scanner = new Scanner(inputFile);
      zoo = new Zoo(scanner);
      scanner.close();

    } catch (FileNotFoundException e) {
      System.out.println("File input " + inputFile.getAbsolutePath() + " tidak ditemukan.");
    } catch (CageFullException e) {
      System.out.println("Pada file input, terdapat kandang yang terisi lebih dari kapasitasnya.");
    } catch (CageHasPreyOrPredatorException e) {
      System.out.println(
          "Pada file input, terdapat hewan mangsa dan predator liar yang ditempatkan bersama.");;
    } catch (CageNotFoundException e) {
      System.out.println("Pada file input, terdapat nama kandang yang tidak dikenali.");
    } catch (ZoneAlreadyExistsException e) {
      System.out.println("Pada file input, terdapat nama zona yang duplikat.");
    } catch (HabitatMismatchException e) {
      System.out.println("Pada file input, terdapat hewan yang ditempatkan pada petak dengan"
          + " habitat yang tidak sesuai.");
    } catch (InputMismatchException e) {
      System.out.println("Format file input tidak dikenali:");
      System.out.println(e.getMessage());
    }

    if (zoo == null) {
      System.out.println("Menggunakan Zoo kosong...");
      zoo = new Zoo(10, 10);
    }

    JFrame frame = new JFrame("Virtual Zoo");
    MainForm mainForm = new MainForm();
    mainForm.getZooDisplay().setZoo(zoo);
    frame.setContentPane(mainForm.getMainPanel());
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
