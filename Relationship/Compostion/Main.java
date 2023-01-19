package Relationship.Compostion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Room room1 = new Room("red", 33);
        // Room room2 = new Room("black", 133);
        // Room room3 = new Room("green", 233);
        // HashMap<Integer, String> myroom = new HashMap<Integer, String>();
        // myroom.get(room1);
        // myroom.get(room2);

        // myroom.get(room3);

        // House myHouse = new House(myroom);

        Ram ram = new Ram(32);
        CPU cpu = new CPU(4);
        ComputerMcthine computerMcthine = new ComputerMcthine(cpu, ram);

        System.out.print(computerMcthine.dashboard());
    }
}
