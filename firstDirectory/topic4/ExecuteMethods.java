package firstDirectory.topic4;

public class ExecuteMethods {

    public static int sum(int a, int b) {
        int sum = 0;
        if (a > b) {
            System.out.println("”Numerele sunt introduse în ordinea greșită” ");
            return 0;
        } else if (a == b) {
            return a;
        } else {
            // int sum = (b - a + 1) * (a + b) / 2; // formula for calculating sum of numbers from a to b
            for (int i = a; i < b; i++) {
                sum += i;
            }
            System.out.println("The sum of a to b " + sum);
            return sum;
        }
    }


    public static void sum(int a) {
        int sum = 0;
        if (a < 0) {
            System.out.println("”Numar este negativ” ");
        } else {
            while (sum <= a) {
                System.out.println(sum);
                sum++;
            }
        }

    }
}
