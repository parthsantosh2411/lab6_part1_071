import java.util.ArrayList;

public class Growable_STK implements Interface_STK {
    private ArrayList<Integer> stack;
    private int top;

    public Growable_STK() {
        stack = new ArrayList<>();
        top = -1;
    }

    @Override
    public void push(int element) { // to insert elements in the stack
        stack.add(element);
        top++;
    }

    @Override
    public int pop() { // to delete element from the stack
        if (isUnderFlow()) {
            System.out.println("Stack is empty");
            return -1; // Consider throwing an exception here instead
        } else {
            int element = stack.remove(top);
            top--;
            return element;
        }
    }

    @Override
    public void displayStack() { // to display the stack
        System.out.println("Stack Elements are:");
        if (isUnderFlow()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack.get(i));
            }
        }
    }

    @Override
    public boolean isOverFlow() { // to check over flow but it never does in growable stack
        return false; // Growable stack never overflows
    }

    @Override
    public boolean isUnderFlow() { // to check under flow
        return top == -1;
    }
}

