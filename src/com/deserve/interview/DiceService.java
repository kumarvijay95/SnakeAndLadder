package com.deserve.interview;

import java.util.Random;

public class DiceService {
    public static int rollEven() {
        return (new Random().nextInt(3) + 1) * 2;
    }

    public static int rollNormal() {
        return new Random().nextInt(6) + 1;
    }
}