# Stack Implementation in Java

This program implements two types of stacks: a fixed-size stack (`Fixed_STK`) and a growable stack (`Growable_STK`). Both implementations adhere to the `Interface_STK` interface, which defines common stack operations.

## Fixed_STK Class
The Fixed_STK class represents a fixed-size stack, meaning it has a predetermined maximum capacity. It uses an array to store elements. The class provides methods to push elements onto the stack, pop elements from the stack, display the elements in the stack, and check for overflow and underflow conditions.

### Definition:
The `Fixed_STK` class implements a fixed-size stack using an array.

### Constructor:
- `Fixed_STK(int max_size)`: Initializes the fixed-size stack with the specified maximum size.

### Methods:
- `push(int element)`: Inserts an element into the stack.
- `pop()`: Removes and returns the top element from the stack.
- `displayStack()`: Displays all elements in the stack.
- `isOverFlow()`: Checks if the stack is full.
- `isUnderFlow()`: Checks if the stack is empty.

## Growable_STK Class
The Growable_STK class implements a growable stack using an ArrayList. Unlike the fixed-size stack, the growable stack has the flexibility to expand dynamically as needed. This implementation eliminates the need to specify a maximum size upfront. The class provides similar methods as Fixed_STK, with the exception that the isOverFlow() method always returns false, as a growable stack never overflows.

### Definition:
The `Growable_STK` class implements a growable stack using an `ArrayList`.

### Constructor:
- `Growable_STK()`: Initializes the growable stack.

### Methods:
- `push(int element)`: Inserts an element into the stack.
- `pop()`: Removes and returns the top element from the stack.
- `displayStack()`: Displays all elements in the stack.
- `isOverFlow()`: Always returns false as a growable stack never overflows.
- `isUnderFlow()`: Checks if the stack is empty.

## Interface_STK Interface
The Interface_STK interface defines a contract for stack operations. Both Fixed_STK and Growable_STK classes implement this interface to ensure consistency in method signatures and behavior.

### Definition:
The `Interface_STK` interface defines common stack operations.

### Methods:
- `push(int element)`: Inserts an element into the stack.
- `pop()`: Removes and returns the top element from the stack.
- `displayStack()`: Displays all elements in the stack.
- `isOverFlow()`: Checks if the stack is full.
- `isUnderFlow()`: Checks if the stack is empty.

## StackDemo Class

### Definition:
The `StackDemo` class provides a demonstration of the `Fixed_STK` implementation.

### Methods:
- `main(String[] args)`: Entry point of the program. Allows users to interactively add elements, display the stack, and pop elements from the fixed-size stack.

## StackDemoGrowable Class

### Definition:
The `StackDemoGrowable` class provides a demonstration of the `Growable_STK` implementation.

### Methods:
- `main(String[] args)`: Entry point of the program. Allows users to interactively add elements, display the stack, and pop elements from the growable stack.

