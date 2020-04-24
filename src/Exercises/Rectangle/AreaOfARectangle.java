package Exercises.Rectangle;

import java.util.Scanner;

public class AreaOfARectangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width:");
        double width = scanner.nextDouble();
        //Area =length * width;
        double area = length * width;
        System.out.println("Area of a Rectangle is: " + area);
    }
}
