import java.util.Scanner;
class StackS {
    // Static stack
    private int[] arr = new int[10];
    private static int top = -1;
    private boolean isEmpty() {
        return top == -1;
    }
    private boolean isFull() {
        return top == 9;
    }
    void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = data;
        }
    }
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped element: " + arr[top]);
            top--;
        }
    }
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }
    void display() {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

class StackD {
    private static int size = 1;
    private int[] arr = new int[size];
    private static int top = -1;
    private boolean isEmpty() {
        return top == -1;
    }
    private boolean isFull() {
        return top == size - 1;
    }
    void push(int data) {
        if (isFull()) {
            size++;
            int[] temp = new int[size];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        top++;
        arr[top] = data;
    }
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped element: " + arr[top]);
            top--;
        }
    }
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }
    void display() {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
public class StackDemo {
    public static void staticStack() {
        Scanner sc2 = new Scanner(System.in);
        StackS s1 = new StackS();
        int c2;
        do {
            System.out.println("\n---------------\nStatic Stack Operations: ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            c2 = sc2.nextInt();
            if (c2 == 1) {
                int data;
                System.out.println("Enter the data: ");
                data = sc2.nextInt();
                s1.push(data);
            } else if (c2 == 2) {
                s1.pop();
            } else if (c2 == 3) {
                s1.peek();
            } else if (c2 == 4) {
                s1.display();
            } else if (c2 == 5) {
                break;
            } else {
                System.out.println("Invalid Choice Try Again");
            }

        } while (true);
    }
    public static void dynamicStack() {
        Scanner sc3 = new Scanner(System.in);
        StackS s2 = new StackS();
        int c3;
        do {
            System.out.println("\n---------------\nDynamic Stack Operations: ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            c3 = sc3.nextInt();
            if (c3 == 1) {
                int data;
                System.out.println("Enter the data: ");
                data = sc3.nextInt();
                s2.push(data);
            } else if (c3 == 2) {
                s2.pop();
            } else if (c3 == 3) {
                s2.peek();
            } else if (c3 == 4) {
                s2.display();
            } else if (c3 == 5) {
                break;
            } else {
                System.out.println("Invalid Choice Try Again");
            }

        } while (true);

    }
    public static void main(String[] args) {
        int c1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n---------------\nStack Type: ");
            System.out.println("1. Static Stack");
            System.out.println("2. Dynamic Stack");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            c1 = sc.nextInt();
            if (c1 == 1) {
                staticStack();
            } else if (c1 == 2) {
                dynamicStack();
            } else if (c1 == 3) {
                sc.close();
                break;
            } else {
                System.out.println("Invalid Choice Try Again");
            }
        } while (c1 != 3);
    }
}