public class app {
    public static void main(String[] args) {
        // 3a addition
        int value1 = 23;
        int value2 = 45;
        int sum;
        int product;
        sum = value1 + value2;
        System.out.println(value1 + " + " + value1 + " = " + sum);
        // 3a subtraction
        sum = value1 - value2;
        System.out.println(value1 + " - " + value2 + " = " + sum);
        // 3b multiplication
        int value3 = 234232;
        int value4 = 3424;
        product = value3 * value4;
        System.out.println(value3 + " * " + value4 + " = " + product);
        product = value2 * value3 * value4;
        System.out.println(value2 + " * " + value3 + " * " + value4 + " = " + product);
        // 3c division
        float value1F = value1;
        float value2F = value2;
        float quota = value1F / value2F;
        System.out.println(value1 + " / " + value2 + " = " + quota);
        int value5 = 10;
        int value6 = 3;
        float value6F = value6;
        float value3F = value3;
        quota = value6F / value3F;
        System.out.println(value6 + " / " + value3 + " = " + quota);
        // 3d modulo
        int remainder;
        remainder = value5 % value6;
        System.out.println(value5 + " % " + value6 + " = " + remainder);
        remainder = 12 % 4;
        System.out.println("12 " + "%" + " 4" + " = " + remainder);
    }
}