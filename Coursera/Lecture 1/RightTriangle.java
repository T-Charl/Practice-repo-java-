

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
//         int a = 0;
//         int b = 0;
//         int c = -2;
        boolean case1 = (a*a)+(b*b)==(c*c);
        boolean case2 = a > 0 && b >0 && c > 0;

        System.out.println(case1 == case2 && case1 != false);
    }
}




