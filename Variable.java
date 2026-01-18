public class Variable {

    int instantVar = 10;

    static String staticVar = "I'm Static";

    public void printVariable() {
        int localVar = 5;
        System.out.println("Local:" + localVar);
        System.out.println("Static:" + staticVar);
        System.out.println("Instant:" + instantVar);
    }

    public static void main(String[] args) {
        Variable v1 = new Variable();
        v1.printVariable();
        String a = v1.staticVar;
        System.out.println("Access using class: " + a);

    }

}
