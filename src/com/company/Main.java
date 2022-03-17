package com.company;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(sqrt().apply(25.0));

    }
    public static UnaryOperator<Double> sqrt(){
        return Math::sqrt;
    }
}
