package com.company;

public class BinOps {
    public String sum(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) +Integer.parseInt(b, 2));
        }

    public String sumToPrint (String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        return (a1 + " + " + b1 + " = " + (a1+b1));
    }

    public String mult(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
    }

    public String multToPrint (String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        return (a1 + " * " + b1 + " = " + (a1*b1));

    }
}
