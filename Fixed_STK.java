public class Fixed_STK implements Interface_STK {
    private final int[] stack;
    private int top;

    public Fixed_STK(int max_size) {
        stack = new int[max_size];
        top = -1;
    }

    @Override
    public void push(int element) { // to insert element in the stack
        if (isOverFlow())
            System.out.println("Stack is Full");
        else {
            top++;
            stack[top] = element;
        }
    }

    @Override
    public int pop() { // to pop elements from the stack
        if (isUnderFlow()) {
            System.out.println("Stack is empty");
            return -1; // Consider throwing an exception here instead
        } else {
            int element = stack[top];
            top--;
            return element;
        }
    }

    @Override
    public void displayStack() { // to check display stack
        System.out.println("Stack Elements are:");
        if (isUnderFlow()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }

    @Override
    public boolean isOverFlow() { // to check over flow
        return top == stack.length - 1;
    }

    @Override
    public boolean isUnderFlow() { // to check under flow
        return top == -1;
    }
}


