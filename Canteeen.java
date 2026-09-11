import java.util.Scanner;

public class Canteeen {

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        int item;
        int quantity;
        char student;
        double price;
        double subtotal;
        double discount;
        double total;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Fries     - $200.00");
            System.out.println("2. Pizza     - $180.00");
            System.out.println("3. Pasta     - $100.00");
            System.out.println("4. Ice Cream - $80.00");
            System.out.println("5. Coffee    - $140.00");

            System.out.print("Enter item number: ");
            item = input.nextInt();

            if (item == 1) {
                price = 200;
            } else if (item == 2) {
                price = 180;
            } else if (item == 3) {
                price = 100;
            } else if (item == 4) {
                price = 80;
            } else if (item == 5) {
                price = 140;
            } else {
                 System.out.println("Invalid item number!!!");
                continue;
            }

            System.out.print("Enter quantity: ");
            quantity = input.nextInt();

            subtotal = price * quantity;

             System.out.print("Are you a student? (Y/N): ");
            student = input.next().charAt(0);

            discount = 0;

            if (student == 'Y' || student == 'y') {

                if (subtotal >= 500) {
                    discount = subtotal * 0.15;
                } else {
                    discount = subtotal * 0.10;
                }
            }

            total = subtotal - discount;

           System.out.printf("Subtotal: $%.2f\n", subtotal);
            System.out.printf("Discount: $%.2f\n", discount);
            System.out.printf("Total Amount: $%.2f\n", total);


        } while (true);
          System.out.println("Thank you for ordering!");
          input.close();
    }
}