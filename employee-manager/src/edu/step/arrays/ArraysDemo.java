package edu.step.arrays;

import edu.step.Product;
import edu.step.service.IpodSimple;

public class ArraysDemo {

    private int percentage;
    private int[] numbers;
    private String[] textLines;
    private Product[] products;
    private int[][] biDimensional;


    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        // Declararea array-ului
//        int[] integers = new int[100];
//        int[] copy = new int[20];
//
//        String[] value = new String[]{"Hello!", "Test!"};
//        String[][] lines = new String[20][5];
//
////        // Initializarea array-ului
//        integers[0] = 10;
////        integers[1] = sc.nextInt();
////        integers[9] = sc.nextInt();
//
//        System.out.println("Introduceti " + integers.length + " numere:");
//        for (int i = 0; i < integers.length; i++) {
//            integers[i] = sc.nextInt();
//        }
//
//
//        // Citim o valoare din array
//        System.out.println(integers[2]);
//        System.out.println(integers[200]);
//
//        int[] obj = new int[100];
//        integers.equals(obj);
//
//        Arrays.equals(obj, integers);

        multiArrayDemo();


    }

    static void multiArrayDemo() {
        String[][] lines = new String[20][5];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 5; j++) {
                lines[i][j] = "Text " + i + " " + j;
            }
        }

        char[][] board = new char[3][3];
        char[][] board2 = new char[][]
                {
                        {'X', '_', '_'},
                        {'_', 'X', '_'},
                        {'_', '_', 'X'}
                };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board2[i][j]);
            }
            System.out.println();
        }

        String[][] lines2 = new String[5][];
        for (int i = 0; i < lines2.length; i++) {
            lines2[i] = new String[i+1];
            for (int j = 0; j < (i+1); j++) {
                lines2[i][j] = "(" + i  + " " + j + ")";
            }
        }

        for (int i = 0; i < lines2.length; i++) {
            for (int j = 0; j < lines2[i].length; j++) {
                System.out.print(lines2[i][j]);
            }
            System.out.println();
        }

        for(String[] arr: lines2) {
            for(String element: arr) {
                System.out.print(element);
            }
            System.out.println();
        }



        String[] strings = {"Hello ", " my", " name ", "is ", "Duke!"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        for(String element: strings) {
            System.out.println(element);
        }



    }

}
