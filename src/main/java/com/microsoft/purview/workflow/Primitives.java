package com.microsoft.purview.workflow;

public class Primitives {
    public static Expression s(String value) {
        return () -> "'" + value + "'";
    }

    public static Expression i(int value) {
        return () -> Integer.toString(value);
    }

    public static Expression f(double value) {
        return () -> Double.toString(value);
    }
}
