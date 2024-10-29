class OuterClass {
    static String staticOuterField = "Static Outer Field";

    // Static nested class
    static class StaticNestedClass {
        void instanceMethod() {
            System.out.println("Instance Method: " + staticOuterField);
        }

        static void staticMethod() {
            System.out.println("Static Method: " + staticOuterField);
        }
    }
}

public class Test52 {
    public static void main(String[] args) {
        // Create an instance of the static nested class
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.instanceMethod(); // Outputs: Instance Method: Static Outer Field
        OuterClass.StaticNestedClass.staticMethod(); // Outputs: Static Method: Static Outer Field
    }
}