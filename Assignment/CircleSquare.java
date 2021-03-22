package Assignment;

import java.util.Scanner;

public class CircleSquare {
    public static void main(String[] args){
        int width, height;

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scan.nextInt();
        System.out.println("Enter Height: ");
        height = scan.nextInt();

        for (int h = -height; h < height; h++) {
            for (int w = -width; w < width; w++) {
                if (w * w + h * h <= height / 2 * width / 2) {
                    if (h == 0 && w == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("O");
                    }
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }
}