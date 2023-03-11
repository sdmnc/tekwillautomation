package firstDirectory.topic3;

public class Operations {

    public static void main(String []args){
        printArithmeticOperations();
        printLogicOperations();
        printRelationalOperation();
    }
    static void printArithmeticOperations() {
        System.out.println("ArithmeticOperations");
        int a = 10;
        int b = 110;
        int sum = a+b;
        int min = b-a;
        int der = a*b;
        double quotient = b/a;
        int restulImpartirii = b%a;
        System.out.println("The sum of a+b equals " + sum);
        System.out.println("B-A equals " + min);
        System.out.println("The derivative  of a*b equals " + der);
        System.out.println("The quotient  of b equals " + quotient);
        System.out.println("The restul impartirii of b equals " + restulImpartirii);



    }

    static void printLogicOperations() {
        System.out.println("Logic Operations");
        // && (logical AND)
       // || (logical OR)
        // ! (logical NOT):
        boolean a = true;
        boolean b = false;

// logical AND
        if (a && b) {
            System.out.println("This will not be printed.");
        }

// logical OR
        if (a || b) {
            System.out.println("This will be printed.");
        }

// logical NOT
        if (!b) {
            System.out.println("This will be printed.");
        }


    }

    static void printRelationalOperation() {
        System.out.println("Relational");
        int a = 5;
        int b = 7;

// equal to
        if (a == b) {
            System.out.println("This will not be printed.");
        }

// not equal to
        if (a != b) {
            System.out.println("This will be printed.");
        }

// greater than
        if (b > a) {
            System.out.println("This will be printed.");
        }

// less than
        if (a < b) {
            System.out.println("This will be printed.");
        }

// greater than or equal to
        if (b >= a) {
            System.out.println("This will be printed.");
        }

// less than or equal to
        if (a <= b) {
            System.out.println("This will be printed.");
        }

    }
    static void useForAndWhile(){
        System.out.println("Cycles");
        for(int i= 0; i<5; i++){
            System.out.println(i);
        }
        int a =0;
        while(a<4){
            System.out.println(a);
            a++;
        }

    }
}
