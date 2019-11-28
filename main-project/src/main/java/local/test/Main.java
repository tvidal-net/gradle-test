package local.test;

import kafka.utils.TestUtils;

public class Main {

    private static final int SIZE = 32;

    public static void main(String[] args) {
        System.out.println(TestUtils.randomString(SIZE));
    }
}
