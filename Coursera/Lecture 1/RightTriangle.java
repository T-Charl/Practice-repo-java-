import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class RightTriangle {
    public static void main(String[] args) {
        if (args.length == 3) {
            Arrays.sort(args);
            System.out.println(Arrays.toString(args));

            int a = parseInt(args[0]);
            int b = parseInt(args[1]);
            int c = parseInt(args[2]);

            if (a * a + b * b == c * c) {
                System.out.println("true");


//            if (a < 0 || b < 0 || c < 0) {
//                System.out.println("false");
//
//            } else if (a * a + b * b == c * c) {
//                System.out.println("true");
//            }
            } else {
                System.out.println("false");
            }

        } else {
            System.out.println("false");

        }
    }
}




