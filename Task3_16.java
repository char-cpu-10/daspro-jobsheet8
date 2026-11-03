

import java.util.Scanner;

public class Task3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numbers;
        do {
            System.out.print("Enter the store number: ");
            numbers = sc.nextInt();
            if (numbers < 1){
                System.out.println("Number of stores must be at least 1. Please try again.");
            }
        } while (numbers < 1);
        int Thetotal = 0;
        int mostitems = 0;
        int beststores = 0;
        int customer = 0;
        int i = 1;
        int store_items = 0;

        for (i = 1; i <= numbers; i++){
            System.out.println("Store" + i);
            do {
                System.out.print("Number of customers: ");
                customer = sc.nextInt();
                if (customer < 0) {
                    System.out.println("Number of customer invalid. Please try again.");
                }
            } while (customer < 0);
            
            for (int j = 1; j <= customer; j++){
                int items;
                do {
                    System.out.print("Items bought by customer " + j + ": ");
                    items = sc.nextInt();
                    if (items < 0) {
                        System.out.println("Items input is invalid. Please try again.");
                    }
                } while (items < 0);
                store_items += items;
            }
            System.out.println("Store " + i + " - customers: " + customer + ", total items: " + store_items);
            Thetotal += store_items;

            if (store_items > mostitems) {
            mostitems = store_items;
            beststores = i ;
        } 
    }
    System.out.println("Total items across all stores: " + Thetotal);
    System.out.println("Stores with the most items: " + beststores );
    sc.close();
}
}
