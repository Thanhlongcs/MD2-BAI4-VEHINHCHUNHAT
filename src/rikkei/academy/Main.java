package rikkei.academy;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("enter the height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("your rectangle \n" + rectangle.display());
        System.out.println("perimeter of rectangle: " + rectangle.getPerimeter());
        System.out.println("area of the rectangle: " + rectangle.getArea());
    }
}