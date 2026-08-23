package com.training.scan;
//import java.util.Arrays;
import java.util.ArrayList;

import java.util.Scanner;

public class TwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        scanner.nextLine(); 

        String[][] arrmatrix = new String[rows][cols];
        ArrayList<String> snames = new ArrayList<>();

        System.out.println("\nEnter the string values for a " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element at [%d][%d]: ", i, j);
                arrmatrix[i][j] = scanner.nextLine().trim();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String currname = arrmatrix[i][j];
                if (!currname.isEmpty() && currname.toLowerCase().startsWith("s")) {
                	snames.add(currname);
                }
            }
        }

        String[] snamearr = snames.toArray(new String[0]);

        System.out.println("\n  Names starting with 'S' ");
        if (snamearr.length == 0) {
            System.out.println("No names starting with 'S' were found.");
        } else {
            for (String name : snamearr) {
                System.out.println(name);
            }
        }

        scanner.close();
	}

}
