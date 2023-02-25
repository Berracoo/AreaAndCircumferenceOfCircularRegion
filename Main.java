import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter a number for radius : ");
       int radius = input.nextInt();
        System.out.println();
        input.close();
        double pi = 3.14;
        double circumference = 2 * pi * radius;
        double area = (circumference * radius) / 2;
        // another way of finding is Math.pow(radius,2)*pi or
        // radius * radius * pi
        System.out.println("Area of the circular region is : " + area +
                " " + "Circumference of the circular region is : " + circumference);

    }
}
