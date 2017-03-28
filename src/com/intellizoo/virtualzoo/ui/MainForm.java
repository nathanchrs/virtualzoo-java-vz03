package com.intellizoo.virtualzoo.ui;
/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : MainForm.java
 * Tanggal dibuat    : 3/28/17
 * Tanggal perubahan : 3/28/17
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainForm {

  private JPanel MainPanel;
  private JScrollPane ZooScrollPane;
  private JPanel BottomPanel;
  private JButton btnLoad;
  private JButton btnFoodConsumption;
  private ZooDisplay ZooDisplay;
  private JList InteractionsList;

  public MainForm() {
    btnFoodConsumption.addActionListener(new ActionListener() {
      /**
       * Invoked when an action occurs.
       */
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Kebutuhan makanan per hari: \n 111");
      }
    });
  }

  public JPanel getMainPanel() {
    return MainPanel;
  }

  public ZooDisplay getZooDisplay() {
    return ZooDisplay;
  }
}
