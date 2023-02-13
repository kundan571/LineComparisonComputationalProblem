package linecomparisonproblem;

import java.util.Scanner;
public class Linecomparisonucbuilder {
    // Calculate length and return
    public int lengthCalculate(int x1, int y1, int x2, int y2) {
        int length = (int) Math.pow((x2 - x1), 2) + (int) Math.pow((y2 - y1), 2);
        return (int) Math.sqrt(length);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Linecomparisonucbuilder length = new Linecomparisonucbuilder();
        int x1, y1, x2, y2;
        System.out.println("Enter first coordinates x1 and y1: ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.println("Enter second coordinates x2 and y2: ");
        x2 = input.nextInt();
        y2 = input.nextInt();
        System.out.println("length of line: " + length.lengthCalculate(x1, y1, x2, y2));


    }
}