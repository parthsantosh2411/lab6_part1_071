import java.util.Scanner;

public class StackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();

        Fixed_STK fixed_stk = new Fixed_STK(numElements);

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            fixed_stk.push(element);
        }

        int choice;
        do {
            System.out.println("\n1. Add element\n2. Display stack\n3. Pop element\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int newElement = scanner.nextInt();
                    fixed_stk.push(newElement);
                    break;
                case 2:
                    fixed_stk.displayStack();
                    break;
                case 3:
                    fixed_stk.pop();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
