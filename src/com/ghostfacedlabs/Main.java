package com.ghostfacedlabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Application to calculate the cost to tile a room");


        while (true) {
            System.out.print("Please enter a tile cost: ");
            String input = scanner.nextLine();
            System.out.print("Room Length: ");
            String lengthInput = scanner.nextLine();
            System.out.print("Room Width: ");
            String widthInput = scanner.nextLine();

            double cost;
            int length;
            int width;

            try {
                cost = Double.parseDouble(input);
                length = Integer.parseInt(lengthInput);
                width = Integer.parseInt(widthInput);
            } catch (NumberFormatException n) {
                System.out.println("Enter a valid cost, length, and width!");
                continue;
            }

            Room room = new Room(length, width);
            System.out.println("Total cost to tile is $" + room.costToTile(cost));
            break;
        }

    }
}
