import java.util.Scanner;

public class sumofcolumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (args.length >= 2) {
            try {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                System.out.println(a + b);
                return;
            } catch (NumberFormatException e) {
                // fall through to read from stdin
            }
        }
        System.out.print("Enter first number: ");
    
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println(a + b);
        sc.close();
    }
}

