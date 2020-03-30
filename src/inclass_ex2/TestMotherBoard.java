package inclass_ex2;

import java.util.Scanner;

public class TestMotherBoard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String manufacturer;
        int memory_size, number_of_modules;

        System.out.println("Enter manufacturer: ");
        manufacturer = in.nextLine();
        System.out.println("Enter memory size: ");
        memory_size = in.nextInt();

        System.out.println("Enter number of memory modules: ");
        number_of_modules = in.nextInt();

        MotherBoard mother_board = new MotherBoard(manufacturer, memory_size, number_of_modules);

        System.out.println(mother_board);
    }
}
