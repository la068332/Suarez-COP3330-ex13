import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the principal amount?");
        double P = scanner.nextDouble();
        System.out.println("What is the rate?");
        double rate = scanner.nextDouble();
        double r = rate / 100.0;
        System.out.println("What is the number of years?");
        double t = scanner.nextDouble();
        System.out.println("What is the number of times the interest is compounded per year?");
        double n = scanner.nextDouble();
        double A1 = P*(Math.pow((1 + (r/n)), (n*t)));
        double total = Math.round(A1*100.0) / 100.0;
        System.out.println("$"+P+" invested at "+rate+"% for "+t+" years compounded "+
                n+" times per year is $"+total);
    }
}
