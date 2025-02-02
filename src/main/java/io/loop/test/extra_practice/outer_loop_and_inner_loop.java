package io.loop.test.extra_practice;

public class outer_loop_and_inner_loop {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 3; j++) {
                sum += i * j;

                System.out.println(sum);

            }

        }
    }
}
