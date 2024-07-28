import java.util.Scanner;

public class practice {
    private static Scanner scanner = new Scanner(System.in); // Class-level Scanner

    public static void main(String[] args) {
        while (true) {
            System.out.print("What would you like to do?\n 1: Find the area and perimeter\n 2: Check Even or Odd\n 3: Display the Table \n 4: Findin Fibonacci series  5: Mean/median and mode  \n  exit : Anythin else  \n Ans: > ");
            int ans = scanner.nextInt();
            if (ans == 1) {
                finding();
            } else if (ans == 2) {
                even_odd();
            } else if (ans == 3) {
                table();
            }
            else if ( ans == 4 ){
                fin();
            }
            else if ( ans == 5 ){
                mmm();
            } else {
                System.out.println("Thank you");
                System.out.println("Bye");
                break;
            }
        }
    }

    public static void finding() {
        while (true) {
            System.out.println("\t\tFinding the area and perimeter of a rectangle");
            System.out.print("Enter the length: ");
            double length = scanner.nextDouble();

            System.out.print("Enter the width: ");
            double width = scanner.nextDouble();

            System.out.println("The area is " + length * width);
            System.out.println("The perimeter is " + 2 * (length + width));

            System.out.print("Enter 'q' to quit and anything else to try again: ");
            String ans = scanner.next(); 

            if (ans.equalsIgnoreCase("q")) {
                break;
            }
        }
    }

    public static void even_odd() {
        while (true) {
            System.out.println("\t\tFinding Even or Odd of a number");
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }

            System.out.print("Enter 'q' to quit and anything else to try again: ");
            String ans = scanner.next();

            if (ans.equalsIgnoreCase("q")) {
                break;
            }
        }
    }

    public static void table() {
        while (true) {
            System.out.println("\t\tThe Table");

            System.out.print("Enter the number to create a table: ");
            int num = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }

            System.out.print("Enter 'q' to quit and anything else to try again: ");
            String ans = scanner.next(); 

            if (ans.equalsIgnoreCase("q")) {
                break;
            }
        }
    }
    public static void fin() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\t\t Finding the Fibonacci series ");
            System.out.print("Enter a number: ");
            int limit = scanner.nextInt();
            
            // Initial Fibonacci numbers
            int a = 0;
            int b = 1;
            
            System.out.println("Fibonacci series up to " + limit + ":");
            
            // Print Fibonacci series up to the given limit
            while (a <= limit) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            
            System.out.println(); // For a newline after the series
        }
    }

    public static void mmm (){
        while ( true ){
            System.out.println("\t\t Finding the Mean , median and mode ");
            System.out.println("1 : Mean \n 2 : Median \n 3 Mode");
            System.out.print("pls select any opitions of the above ");
            int op = scanner.nextInt();
            if ( op == 1 ){
                mean ();
            }
            else if ( op == 2 ){
                median ();
            }
            else if ( op == 3 ){
                mode ();
            }
            else {
                break;
            }

        }
    }
    public static void mean() {        
        System.out.println("How many numbers do you want to add?");
        int num = scanner.nextInt();
        int[] limit = new int[num];
        int total = 0;
        
        for (int i = 0; i < limit.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            limit[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < limit.length; i++) {
            total += limit[i];
        }
        
        double mean = (double) total / limit.length;
        System.out.println("The mean is: " + mean);
    }

    public static void median (){
        System.out.println("how many numbers ya wanna add : ");
        int num = scanner.nextInt();
        int[] limit = new int[num];
        for (int i = 0 ; i <  limit.length; i ++ ){
            System.out.print("Enter the " + i+1 + " number " );
            limit[i] = scanner.nextInt();
        }
        if ( limit.length % 2 == 0 ){


        }
        else if ( limit.length % 2 != 0 ){
            // have to work mf 

            }

        }
        else {
            System.out.println("invalid input pls enter numbers next time ");
        }
    }

}
