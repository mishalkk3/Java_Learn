package GuestList;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] guests = new String[10];

    public static void main(String[] args) {
        insertTestNames();

        do {
            displayGuest();
            displayMenu();
            int option = getOption();
            System.out.println();

            if (option == 1) {
                addGuest();
            }
            else if (option == 2) {
                insertGuest();
            }

            else if (option == 3){
                renameGuest();
            }
            else if (option == 4){
                removeGuest();
            }
            else if (option == 5)
                break;

        } while (true);

        System.out.println("Exiting....");

    }

    public static void displayGuest() {
        System.out.println("______________________________");
        System.out.println("- Guest -");
        boolean isEmpty = true;
        for (int i=0;i<guests.length;i++) {
            if (guests[i] != null) {
                isEmpty = false;
                System.out.println((i + 1) + ". " + guests[i]);
            }
        }
        if (isEmpty)
            System.out.println("Guest List is Empty");
    }

    public static void displayMenu(){
        System.out.println("______________________________");
        System.out.println("- Menu -");
        System.out.println("1-Add Guest");
        System.out.println("2-Insert Guest");
        System.out.println("3-Rename Guest");
        System.out.println("4-Remove Guest");
        System.out.println("5-Exit");
        System.out.print("Option: ");
    }

    public static int getOption() {
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public static void addGuest() {
        for (int i=0; i<guests.length; i++) {
            if (guests[i] == null){
                System.out.print("Name: ");
                guests[i] = scanner.nextLine();;
                break;
            }
        }
    }

    public static void insertGuest() {
        System.out.print("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        if (num>=1 && num<=10 && guests[num-1]!=null) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            for (int i= guests.length-1;i>num-1;i--){
                guests[i] = guests[i-1];
            }
            guests[num - 1] = name;
        }
        else {
            System.out.println("Error: No guest with that number");
        }
    }

    public static void renameGuest() {
        System.out.print("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        if (num>=1 && num<=10 && guests[num-1]!=null) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            guests[num - 1] = name;
        }
        else {
            System.out.println("Error: No guest with that number");
        }
    }

    public static void removeGuest() {
        System.out.print("Guest Number: ");
        int num = scanner.nextInt();
        if (num>=1 && num<=10 && guests[num-1]!=null) {
            guests[num - 1] = null;
            System.out.println();
            String[] temp = new String[guests.length];
            int ti = 0;
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null) {
                    temp[ti] = guests[i];
                    ti++;
                }
            }
            guests = temp;
        }
        else
            System.out.println("Error: No guest with that number");
    }

    public static void insertTestNames() {
        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";
    }
}
