import java.util.Scanner;
public class StackDemoGrowable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Interface_STK growable_stk = new Growable_STK();

        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            growable_stk.push(element);
        }

        int choice;
        do {
            System.out.println("\n1. Add element to Growable Stack\n2. Display Growable Stack\n3. Pop from Growable Stack\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add to Growable Stack: ");
                    int growableElement = scanner.nextInt();
                    growable_stk.push(growableElement);
                    break;
                case 2:
                    growable_stk.displayStack();
                    break;
                case 3:
                    growable_stk.pop();
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

