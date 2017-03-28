package com.intellizoo.virtualzoo.zoo;

import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.Animal;
import com.intellizoo.virtualzoo.zoo.animal.aves.Eagle;
import com.intellizoo.virtualzoo.zoo.animal.aves.Owl;
import com.intellizoo.virtualzoo.zoo.animal.aves.Parrot;
import com.intellizoo.virtualzoo.zoo.animal.aves.Peacock;
import com.intellizoo.virtualzoo.zoo.animal.aves.Pigeon;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Gorilla;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Leopard;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Lion;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Orangutan;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Tiger;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Barracuda;
import com.intellizoo.virtualzoo.zoo.animal.pisces.FrenchAngelFish;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Lionfish;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Ray;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Seahorse;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Chameleon;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Cobra;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Iguana;
import com.intellizoo.virtualzoo.zoo.animal.reptile.KomodoDragon;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Python;
import com.intellizoo.virtualzoo.zoo.cell.Cell;
import com.intellizoo.virtualzoo.zoo.cell.habitat.Habitat;
import com.intellizoo.virtualzoo.zoo.cell.park.Park;
import com.intellizoo.virtualzoo.zoo.cell.restaurant.Restaurant;
import com.intellizoo.virtualzoo.zoo.cell.road.Road;
import com.intellizoo.virtualzoo.zoo.zone.Cage;
import com.intellizoo.virtualzoo.zoo.zone.Zone;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : Zoo.java
 * Tanggal dibuat    : 3/28/17
 * Tanggal perubahan : 3/28/17
 */

/**
 * Kelas Zoo yang merepresentasikan sebuah kebun binatang.
 *
 * @author Jordhy Fernando
 */
public class Zoo {
  
  private int rows;
  private int cols;
  private List<Cell> cells;
  private List<Zone> zones;

  /**
   * Menciptakan kebun binatang dengan ukuran tertentu.
   *
   * @param rows Ukuran vertikal kebun binatang.
   * @param cols Ukuran horizontal kebun binatang.
   */
  public Zoo(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    cells = new ArrayList<>(rows * cols);
    zones = new ArrayList<>();
    for (int i = 0; i < rows * cols; i++) {
      cells.add(new Road(new Point(i / cols, i % cols), true, false, false));
    }
  }

  /**
   * Menciptakan kebun binatang berdasarkan data dari sumber input eksternal.
   *
   * @param reader Scanner yang membaca sumber input eksternal.
   */
  public Zoo(Scanner reader) {
    rows = reader.nextInt();
    cols = reader.nextInt();
    cells = new ArrayList<>(rows * cols);
    zones = new ArrayList<>();
    for (int i = 0; i < rows * cols; i++) {
      cells.add(new Road(new Point(i / cols, i % cols), true, false, false));
    }

    int zoneCount;
    zoneCount = reader.nextInt();
    for (int i = 0; i < zoneCount; i++) {
      String zoneType;
      String zoneName;
      zoneType = reader.next();
      zoneName = reader.next();
      if (zoneType.equalsIgnoreCase("Cage")) {
        addZone(new Cage(zoneName));
      } else if (zoneType.equalsIgnoreCase("Zone")) {
        addZone(new Zone(zoneName));
      } else {
        //throw InputException();
      }

      int cellCount;
      cellCount = reader.nextInt();
      for (int j = 0; j < cellCount; j++) {
        String cellType;
        int row;
        int col;
        cellType = reader.next();
        row = reader.nextInt();
        col = reader.nextInt();
        Point pos = new Point(row, col);
        if (cellType.equalsIgnoreCase("AirHabitat")) {
          addCell(new Habitat(pos, Habitat.HabitatType.AirHabitat), zoneName);
        } else if (cellType.equalsIgnoreCase("LandHabitat")) {
          addCell(new Habitat(pos, Habitat.HabitatType.LandHabitat), zoneName);
        } else if (cellType.equalsIgnoreCase("WaterHabitat")) {
          addCell(new Habitat(pos, Habitat.HabitatType.WaterHabitat), zoneName);
        } else if (cellType.equalsIgnoreCase("Park")) {
          addCell(new Park(pos, false), zoneName);
        } else if (cellType.equalsIgnoreCase("Restaurant")) {
          addCell(new Restaurant(pos, false), zoneName);
        } else if (cellType.equalsIgnoreCase("Road")) {
          addCell(new Road(pos, true, false, false), zoneName);
        } else if (cellType.equalsIgnoreCase("Entrance")) {
          addCell(new Road(pos, true, true, false), zoneName);
        } else if (cellType.equalsIgnoreCase("Exit")) {
          addCell(new Road(pos, true, false, true), zoneName);
        } else {
          //throw InputException();
        }
      }

      int animalCount;
      animalCount = reader.nextInt();
      for (int j = 0; j < animalCount; j++) {
        String species;
        species = reader.next();
        int row;
        row = reader.nextInt();
        int col;
        col = reader.nextInt();
        int weight;
        weight = reader.nextInt();
        boolean wild;
        wild = reader.nextInt() != 0;
        Point pos = new Point(row, col);
        if (species.equalsIgnoreCase("Eagle")) {
          Eagle animal = new Eagle(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Owl")) {
          Owl animal = new Owl(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Parrot")) {
          Parrot animal = new Parrot(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Peacock")) {
          Peacock animal = new Peacock(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Pigeon")) {
          Pigeon animal = new Pigeon(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Barracuda")) {
          Barracuda animal = new Barracuda(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("FrenchAngelFish")) {
          FrenchAngelFish animal = new FrenchAngelFish(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Lionfish")) {
          Lionfish animal = new Lionfish(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Ray")) {
          Ray animal = new Ray(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Seahorse")) {
          Seahorse animal = new Seahorse(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Gorilla")) {
          Gorilla animal = new Gorilla(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Leopard")) {
          Leopard animal = new Leopard(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Lion")) {
          Lion animal = new Lion(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Orangutan")) {
          Orangutan animal = new Orangutan(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Tiger")) {
          Tiger animal = new Tiger(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Chameleon")) {
          Chameleon animal = new Chameleon(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Cobra")) {
          Cobra animal = new Cobra(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Iguana")) {
          Iguana animal = new Iguana(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("KomodoDragon")) {
          KomodoDragon animal = new KomodoDragon(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if (species.equalsIgnoreCase("Python")) {
          Python animal = new Python(species, pos, weight, wild);
          addAnimal(animal, zoneName);
        } else {
          //throw InputException();
        }
      }
    }
    reader.close();
  }

  /**
   * Menambahkan sebuah zona ke dalam kebun binatang.
   *
   * @param zone Zona yang ditambahkan ke dalam kebun binatang.
   */
  public void addZone(Zone zone) {
    if (findZone(zone.getName()) == null) {
      zones.add(zone);
    } else {
      //throw ZoneAlreadyExistsException();
    }
  }

  /**
   * Menambahkan sebuah cell ke dalam kebun binatang.
   *
   * @param cell Cell yang ditambahkan ke dalam kebun binatang.
   * @param zoneName Cell akan ditambahkan sebagai bagian dari zona dengan nama ini.
   */
  public void addCell(Cell cell, String zoneName) {
    Point pos = cell.getPosition();
    if (pos.inArea(rows, cols)) {
      cells.set(idx(pos), cell);

      Zone zone = findZone(zoneName);
      if (zone != null) {
        zone.addCell(cells.get(idx(pos)));
      } else {
        //throw out_of_range("Zone name not found.");
      }
    } else {
      //throw out_of_range("Cell position is outside of zoo.");
    }
  }

  /**
   * Menambahkan seekor hewan ke dalam kebun binatang.
   *
   * @param animal Hewan yang ditambahkan ke dalam kebun binatang.
   * @param cageName Hewan akan ditambahkan sebagai bagian dari zona/cage dengan nama ini.
   */
  public void addAnimal(Animal animal, String cageName) {
    Zone cage = findZone(cageName);
    if (cage instanceof Cage) {
      Point pos = animal.getPosition();
      if (pos.inArea(rows, cols)) {
        Cell habitat = cells.get(idx(pos));
        if (habitat instanceof Habitat) {
          if (animal.isValidHabitat(((Habitat) habitat).getType())) {
            ((Cage) cage).addAnimal(animal);
          } else {
            //throw WrongHabitatException();
          }
        }
      } else {
        //throw out_of_range("Animal position is outside of zoo.");
      }
    } else {
      //throw out_of_range("Cage name not found.");
    }
  }

  public List<Cell> getCells() {
    return cells;
  }

  public List<Zone> getZones() {
    return zones;
  }

  public int getRows() {
    return rows;
  }

  public int getCols() {
    return cols;
  }

  /**
   * Menghitung banyaknya daging yang dikonsumsi oleh semua hewan di kebun binatang setiap harinya.
   *
   * @return Berat total daging yang dibutuhkan.
   */
  public double calculateTotalMeat() {
    double meat = 0.0;
    for (Zone cage : zones) {
      if (cage instanceof Cage) {
        List<Animal> animals = ((Cage) cage).getAnimals();
        for (Animal animal : animals) {
          meat += animal.getDiet().calculateTotalMeatNeeded();
        }
      }
    }
    return meat;
  }

  /**
   * Menghitung banyaknya sayuran yang dikonsumsi oleh semua hewan di kebun binatang setiap
   * harinya.
   *
   * @return Berat total sayuran yang dibutuhkan.
   */
  public double calculateTotalVegetable() {
    double vegetable = 0.0;
    for (Zone cage : zones) {
      if (cage instanceof Cage) {
        List<Animal> animals = ((Cage) cage).getAnimals();
        for (Animal animal : animals) {
          vegetable += animal.getDiet().calculateTotalVegetableNeeded();
        }
      }
    }
    return vegetable;
  }

  /**
   * Menghasilkan string berisi interaksi apa saja yang terkandung dalam sebuah petak.
   *
   * @param cellPosition posisi petak.
   * @return Daftar interaksi di petak tersebut.
   */
  public String listInteractions(Point cellPosition) {
    StringBuffer interactions = new StringBuffer();
    if (cellPosition.inArea(rows, cols)) {
      Zone cage = findZone(cellPosition);
      if (cage != null && cage instanceof Cage) {
        List<Animal> animals = ((Cage) cage).getAnimals();
        for (Animal animal : animals) {
          interactions.append(animal.interact()).append("\n");
        }
      }
    }
    return interactions.toString();
  }

  /**
   * Menghasilkan string berisi interaksi apa saja yang terkandung dalam sebuah petak dan
   * petak-petak lainnya yang berada tepat di sebelahnya.
   *
   * @param cellPosition posisi petak.
   * @return Daftar interaksi di petak tersebut dan petak-petak sebelahnya.
   */
  public String listNeighboringInteractions(Point cellPosition) {
    StringBuffer interactions = new StringBuffer();
    interactions.append(listInteractions(cellPosition));
    interactions.append(listInteractions(cellPosition.translate(new Point(0, 1))));
    interactions.append(listInteractions(cellPosition.translate(new Point(0, -1))));
    interactions.append(listInteractions(cellPosition.translate(new Point(1, 0))));
    interactions.append(listInteractions(cellPosition.translate(new Point(-1, 0))));
    return interactions.toString();
  }

  /**
   * Mulai thread-thread perilaku untuk semua hewan dalam kandang.
   */
  public void startBehaviorThreads() {
    for (Zone zone : zones) {
      if (zone instanceof Cage) {
        ((Cage) zone).startAnimalBehaviorThreads();
      }
    }
  }

  /**
   * Hentikan thread-thread perilaku untuk semua hewan dalam kandang.
   */
  public void terminateBehaviorThreads() {
    for (Zone zone : zones) {
      if (zone instanceof Cage) {
        ((Cage) zone).terminateAnimalBehaviorThreads();
      }
    }
  }

  /**
   * Mengembalikan indeks Zoo pada baris dan kolom yang ditentukan.
   *
   * @param row Nilai baris.
   * @param col Nilai kolom.
   * @return Nilai indeks di Zoo.
   */
  private int idx(int row, int col) {
    return row * cols + col;
  }

  /**
   * Mengembalikan indeks di Zoo pada posisi yang ditentukan.
   *
   * @param point Nilai titik.
   * @return Nilai indeks di Zoo.
   */
  private int idx(Point point) {
    return point.getRow() * cols + point.getCol();
  }

  /**
   * Mencari zona yang namanya adalah zoneName.
   *
   * @param zoneName Nama zona yang ingin dicari.
   * @return Zona yang ingin dicari, atau null jika tidak ada.
   */
  private Zone findZone(String zoneName) {
    for (Zone zone : zones) {
      if (zone.getName().equalsIgnoreCase(zoneName)) {
        return zone;
      }
    }
    return null;
  }

  /**
   * Mencari zona mana yang mengandung posisi cellPosition
   *
   * @param cellPosition Posisi zona yang ingin dicari.
   * @return Pointer ke zona tersebut, jika tidak ada bernilai nullptr.
   */
  private Zone findZone(Point cellPosition) {
    for (Zone zone : zones) {
      List<Cell> cells = zone.getCells();
      for (Cell cell : cells) {
        if (cell.getPosition().equals(cellPosition)) {
          return zone;
        }
      }
    }
    return null;
  }
}
