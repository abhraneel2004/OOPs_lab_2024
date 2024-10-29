class OuterClass {
    private String outerField = "Outer Field";

    // Member inner class
    class InnerClass {
        void display() {
            System.out.println("Accessing: " + outerField);
        }
    }
}

public class Test51 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display(); // Outputs: Accessing: Outer Field
    }
}