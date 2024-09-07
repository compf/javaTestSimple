package org.example;

public class MathStuff {


    public void printLength(int x, int y, int z) {
        System.out.println(Math.sqrt(x * x + y * y + z * z));
    }
    public void printSum(int x, int y, int z) {
        System.out.println(x + y + z);
    }
    public static void main(String[] args) {
        MathStuff mathStuff = new MathStuff();
        mathStuff.printLength(1, 2, 3);
        mathStuff.printSum(1, 2, 3);
    }






















    private boolean sign;
    private double mantissa;
    private int exponent;

    public double calcValue(){
        return (sign ? 1 : -1) * mantissa * Math.pow(2, exponent);
    }
}
