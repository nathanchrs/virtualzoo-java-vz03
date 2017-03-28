package com.intellizoo.virtualzoo.zoo;
import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.Animal;
import com.intellizoo.virtualzoo.zoo.animal.aves.Eagle;
import com.intellizoo.virtualzoo.zoo.animal.aves.Owl;
import com.intellizoo.virtualzoo.zoo.animal.aves.Parrot;
import com.intellizoo.virtualzoo.zoo.animal.aves.Peacock;
import com.intellizoo.virtualzoo.zoo.animal.aves.Pigeon;
import com.intellizoo.virtualzoo.zoo.animal.mammals.gorilla.Gorilla;
import com.intellizoo.virtualzoo.zoo.animal.mammals.leopard.Leopard;
import com.intellizoo.virtualzoo.zoo.animal.mammals.lion.Lion;
import com.intellizoo.virtualzoo.zoo.animal.mammals.orangutan.Orangutan;
import com.intellizoo.virtualzoo.zoo.animal.mammals.tiger.Tiger;
import com.intellizoo.virtualzoo.zoo.animal.pisces.barracuda.Barracuda;
import com.intellizoo.virtualzoo.zoo.animal.pisces.frenchangelfish.FrenchAngelFish;
import com.intellizoo.virtualzoo.zoo.animal.pisces.lionfish.Lionfish;
import com.intellizoo.virtualzoo.zoo.animal.pisces.ray.Ray;
import com.intellizoo.virtualzoo.zoo.animal.pisces.seahorse.Seahorse;
import com.intellizoo.virtualzoo.zoo.animal.reptile.chameleon.Chameleon;
import com.intellizoo.virtualzoo.zoo.animal.reptile.cobra.Cobra;
import com.intellizoo.virtualzoo.zoo.animal.reptile.iguana.Iguana;
import com.intellizoo.virtualzoo.zoo.animal.reptile.komododragon.KomodoDragon;
import com.intellizoo.virtualzoo.zoo.animal.reptile.python.Python;
import com.intellizoo.virtualzoo.zoo.cell.Cell;
import com.intellizoo.virtualzoo.zoo.cell.habitat.Habitat;
import com.intellizoo.virtualzoo.zoo.cell.park.Park;
import com.intellizoo.virtualzoo.zoo.cell.restaurant.Restaurant;
import com.intellizoo.virtualzoo.zoo.cell.road.Road;
import com.intellizoo.virtualzoo.zoo.zone.Zone;
import com.intellizoo.virtualzoo.zoo.zone.cage.Cage;
import java.util.Scanner;
import java.util.Vector;

// Nama file         : Zoo.java
// Tanggal dibuat    : 28/03/2017
// Tanggal perubahan : 28/03/2017

/**
 * Kelas Zoo yang merepresentasikan sebuah kebun binatang.
 * @author Jordhy Fernando
 */
public class Zoo {
  /**
   * Mengembalikan indeks Zoo pada baris dan kolom yang ditentukan.
   * @param row Nilai baris.
   * @param col Nilai kolom.
   * @return Nilai indeks di Zoo.
   */
  public int idx(int row, int col) {
    return row * cols + col;
  }

  /**
   * Mengembalikan indeks di Zoo pada posisi yang ditentukan.
   * @param P Nilai titik.
   * @return Nilai indeks di Zoo.
   */
  public int idx(Point P) {
    return P.getRow() * cols + P.getCol();
  }

  private int rows;
  private int cols;
  private Vector<Cell> cells;
  private Vector<Zone> zones;

  /**
   * Menciptakan kebun binatang dengan ukuran tertentu.
   * @param rows Ukuran vertikal kebun binatang.
   * @param cols Ukuran horizontal kebun binatang.
   */
  public Zoo(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    cells = new Vector<Cell>(rows * cols);
    zones = new Vector<Zone>();
    for(int i = 0; i < rows * cols; i++) {
      cells.addElement(new Road(new Point(i / cols, i % cols), true, false, false));
    }
  }

  /**
   * Menciptakan kebun binatang berdasarkan data dari sumber input eksternal.
   * @param reader Scanner yang membaca sumber input eksternal.
   */
  public Zoo(Scanner reader) {
    rows = reader.nextInt();
    cols = reader.nextInt();
    cells = new Vector<Cell>(rows * cols);
    for(int i = 0; i < rows * cols; i++) {
      cells.addElement(new Road(new Point(i / cols, i % cols), true, false, false));
    }

    int zoneCount;
    zoneCount = reader.nextInt();
    for(int i = 0; i < zoneCount; i++) {
      String zoneType;
      String zoneName;
      zoneType = reader.next();
      zoneName = reader.next();
      if(zoneType.equals("Cage")) {
        addZone(new Cage(zoneName));
      } else if(zoneType.equals("Zone")) {
        addZone(new Zone(zoneName));
      } else {
        //throw InputException();
      }

      int cellCount;
      cellCount = reader.nextInt();
      for (int j = 0; j < cellCount; j++) {
        String cellType;
        int row, col;
        cellType = reader.next();
        row = reader.nextInt();
        col = reader.nextInt();
        Point pos = new Point(row, col);
        if(cellType.equals("AirHabitat")) {
          addCell(new Habitat(pos, Habitat.HabitatType.AirHabitat), zoneName);
        } else if(cellType.equals("LandHabitat")) {
          addCell(new Habitat(pos, Habitat.HabitatType.LandHabitat), zoneName);
        } else if(cellType.equals("WaterHabitat")) {
          addCell(new Habitat(pos, Habitat.HabitatType.WaterHabitat), zoneName);
        } else if(cellType.equals("Park")) {
          addCell(new Park(pos, false), zoneName);
        } else if(cellType.equals("Restaurant")) {
          addCell(new Restaurant(pos, false), zoneName);
        } else if(cellType.equals("Road")) {
          addCell(new Road(pos, true, false, false), zoneName);
        } else if(cellType.equals("Entrance")) {
          addCell(new Road(pos, true, true, false), zoneName);
        } else if(cellType.equals("Exit")) {
          addCell(new Road(pos, true, false, true), zoneName);
        } else {
          //throw InputException();
        }
      }

      int animalCount;
      animalCount = reader.nextInt();
      for (int j = 0; j < animalCount; j++) {
        String species;
        int row, col, weight;
        boolean wild;
        species = reader.next();
        row = reader.nextInt();
        col = reader.nextInt();
        weight = reader.nextInt();
        wild = reader.nextBoolean();
        Point pos = new Point(row, col);
        if(species.equals("Eagle")) {
          Eagle animal = new Eagle(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Owl")) {
          Owl animal = new Owl(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Parrot")) {
          Parrot animal = new Parrot(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Peacock")) {
          Peacock animal = new Peacock(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Pigeon")) {
          Pigeon animal = new Pigeon(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Barracuda")) {
          Barracuda animal = new Barracuda(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("FrenchAngelFish")) {
          FrenchAngelFish animal = new FrenchAngelFish(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Lionfish")) {
          Lionfish animal = new Lionfish(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Ray")) {
          Ray animal = new Ray(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Seahorse")) {
          Seahorse animal = new Seahorse(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Gorilla")) {
          Gorilla animal = new Gorilla(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Leopard")) {
          Leopard animal = new Leopard(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Lion")) {
          Lion animal = new Lion(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Orangutan")) {
          Orangutan animal = new Orangutan(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Tiger")) {
          Tiger animal = new Tiger(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Chameleon")) {
          Chameleon animal = new Chameleon(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Cobra")) {
          Cobra animal = new Cobra(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Iguana")) {
          Iguana animal = new Iguana(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("KomodoDragon")) {
          KomodoDragon animal = new KomodoDragon(pos, weight, wild);
          addAnimal(animal, zoneName);
        } else if(species.equals("Python")) {
          Python animal = new Python(pos, weight, wild);
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
   * @param zone Zona yang ditambahkan ke dalam kebun binatang.
   */
  public void addZone(Zone zone) {
    if(findZone(zone.getName()) == null) {
      zones.addElement(zone);
    } else {
      //throw ZoneAlreadyExistsException();
    }
  }

  /**
   * Menambahkan sebuah cell ke dalam kebun binatang.
   * @param cell Cell yang ditambahkan ke dalam kebun binatang.
   * @param zoneName Cell akan ditambahkan sebagai bagian dari zona dengan nama ini.
   */
  public void addCell(Cell cell, String zoneName) {
    Point pos = cell.getPosition();
    if(pos.inArea(rows, cols)) {
      cells.set(idx(pos), cell);

      Zone zone = findZone(zoneName);
      if(zone != null) {
        zone.addCell(cells.get(idx(pos));
      } else {
        //throw out_of_range("Zone name not found.");
      }
    } else {
      //throw out_of_range("Cell position is outside of zoo.");
    }
  }

  /**
   * Menambahkan seekor hewan ke dalam kebun binatang.
   * @param animal Hewan yang ditambahkan ke dalam kebun binatang.
   * @param cageName Hewan akan ditambahkan sebagai bagian dari zona/cage
   * dengan nama ini.
   */
  public void addAnimal(Animal animal, String cageName) {
    Zone cage = findZone(cageName);
    if(cage instanceof Cage) {
      Point pos = animal.getPosition();
      if(pos.inArea(rows, cols)) {
        Cell habitat = cells.get(idx(pos));
        if(habitat instanceof  Habitat) {
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

  // Getter
  public Vector<Cell> getCells() {
    return cells;
  }

  public Vector<Zone> getZones() {
    return zones;
  }

  public int getRows() {
    return rows;
  }

  public int getCols() {
    return cols;
  }

  /**
   * Menghitung banyaknya daging
   * yang dikonsumsi oleh semua hewan di kebun binatang setiap harinya.
   * @return Berat total daging yang dibutuhkan.
   */
  public double calculateTotalMeat() {
    double meat = 0.0;
    for(Zone cage : zones) {
      if(cage instanceof Cage) {
        Vector<Animal> animals = ((Cage) cage).getAnimals();
        for (Animal animal : animals) {
          meat += animal.getDiet().calculateTotalMeatNeeded();
        }
      }
    }
    return meat;
  }

  /**
   * Menghitung banyaknya sayuran
   * yang dikonsumsi oleh semua hewan di kebun binatang setiap harinya.
   * @return Berat total sayuran yang dibutuhkan.
   */
  public double calculateTotalVegetable() {
    double vegetable = 0.0;
    for(Zone cage : zones) {
      if(cage instanceof Cage) {
        Vector<Animal> animals = ((Cage) cage).getAnimals();
        for(Animal animal : animals) {
          vegetable += animal.getDiet().calculateTotalVegetableNeeded();
        }
      }
    }
    return vegetable;
  }

  /**
   * Mencari zona yang namanya adalah zoneName.
   * @param zoneName Nama zona yang ingin dicari.
   * @return Zona yang ingin dicari, atau null jika tidak ada.
   */
  public Zone findZone(String zoneName) {
    for(Zone zone : zones) {
      if(zone.getName().equals(zoneName)) {
        return zone;
      }
    }
    return null;
  }

  /**
   * Mencari zona mana yang mengandung posisi cellPosition
   * @param cellPosition Posisi zona yang ingin dicari.
   * @return Pointer ke zona tersebut, jika tidak ada bernilai nullptr.
   */
  public Zone findZone(Point cellPosition) {
    for(Zone zone : zones) {
      Vector<Cell> cells = zone.getCells();
      for(Cell cell : cells) {
        if(cell.getPosition().equals(cellPosition)) {
          return zone;
        }
      }
    }
    return null;
  }

  /**
   * Menghasilkan string berisi interaksi apa saja yang terkandung dalam sebuah petak.
   * @param cellPosition posisi petak.
   * @return Daftar interaksi di petak tersebut.
   */
  public String listInteractions(Point cellPosition) {
    StringBuffer interactions = new StringBuffer();
    if (cellPosition.inArea(rows, cols)) {
      Zone cage = findZone(cellPosition);
      if (cage != null && cage instanceof Cage) {
        Vector<Animal> animals = ((Cage) cage).getAnimals();
        for (Animal animal : animals) {
          interactions.append(animal.interact()).append("\n");
        }
      }
    }
    return interactions.toString();
  }

  /**
   * Menghasilkan string berisi interaksi apa saja yang terkandung dalam
   * sebuah petak dan petak-petak lainnya yang berada tepat di sebelahnya.
   * @param cellPosition posisi petak.
   * @return Daftar interaksi di petak tersebut dan petak-petak sebelahnya.
   */
  public String listNeighboringInteractions(Point cellPosition) {
    StringBuffer interactions = new StringBuffer();
    interactions.append(listInteractions(cellPosition));
    interactions.append(listInteractions(cellPosition.add(new Point(0, 1))));
    interactions.append(listInteractions(cellPosition.add(new Point(0, -1))));
    interactions.append(listInteractions(cellPosition.add(new Point(1, 0))));
    interactions.append(listInteractions(cellPosition.add(new Point(-1, 0))));
    return interactions.toString();
  }
}
