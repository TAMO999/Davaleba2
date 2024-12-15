package org.example;

public class Main {

    public static void main(String[] args) {

      AbstractClass count =new Child();
      String input  ="Hello";
      int resultC = count.countVowel (input);
        System.out.println(resultC);


        InterfaceClass replacer = new InterfaceClass();

        String resultA = replacer.replaceSymbolA("Ana");
        System.out.println(resultA);


        String resultB = replacer.replaceSymbolB("Abashishvili");
        System.out.println(resultB);


        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};

        for ( int i=0; i < arr.length -1; i++) {
            int minIndex = i;

            for (int j=i ; j<arr.length; j++){
                if (arr [j] < arr [minIndex]) {
            minIndex =j;

                }
            }
            int number = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=number;
        }
        System.out.print("ზრდადობის მიხედვით: ");
        for (int i=0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
                }

        }

