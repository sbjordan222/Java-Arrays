package com.tts;
import java.util.Arrays;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        int num[] = fill();
        int sum = sum(num);
        System.out.printf("The sum of the numbers is %d\n", sum);
        int size = 4;
        int power = 2;
        int [] result = toPower(size, power);
        System.out.printf("The power of %d, with a size of %d is = %s\n", power, size, Arrays.toString(result));
    }

    public static int [] fill() {
        int [] num = {1,5,6,5,4,22};
        return (num);
    }

    public static int sum(int[] num) {
        int sum = 0;
        for(int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static int [] toPower(int size, int power) {
        int [] powers = new int[size];
        Arrays.fill(powers, 0);

        for(int i = 0; i < size; i++) {
            powers[i] = (int)Math.pow(i, power);
        }
        return powers;
    }
}

