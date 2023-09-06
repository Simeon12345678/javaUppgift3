import java.util.Scanner;

public class uppgift_3b {
    public static void main(String[] args) {
        // a
        Scanner keyboard = new Scanner(System.in);
        System.out.print("input a number: ");
        int num1 = keyboard.nextInt();
        System.out.print("input another number: ");
        int num2 = keyboard.nextInt();
        int product = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + product);
        // b
        System.out.print("input a decimal number: ");
        float num3 = keyboard.nextFloat();
        System.out.print("input a second decimal: ");
        float num4 = keyboard.nextFloat();
        float qouta = num3 / num4;
        System.out.println(num3 + " / " + num4 + " = " + qouta);
        // c
        System.out.print("input a number: ");
        int num5 = keyboard.nextInt();
        System.out.print("input another number");
        int num6 = keyboard.nextInt();
        int modulo = num5 % num6;
        System.out.println(num5 + " % " + num6 + " = " + modulo);
        // d
        System.out.print("input a number: ");
        double num7 = keyboard.nextFloat();
        System.out.print("input a number to raise the first one by: ");
        double num8 = keyboard.nextFloat();
        double power = Math.pow(num7, num8);
        System.out.println(num7 + "^" + num8 + " = " + power);
        // e
        System.out.print("input a number: ");
        int num9 = keyboard.nextInt(); 
        System.out.print("input another number: ");
        int num10 = keyboard.nextInt();
        int compareMax = Math.max(num9, num10);
        int compareMin = Math.min(num9, num10);
        System.out.println(compareMax + " är större än " + compareMin);
    }
}
