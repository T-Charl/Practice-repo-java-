
public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int hyp = Math.max(a, Math.max(b, c));
        int side1 = Math.min(a, Math.max(b, c));
        int side2 = a + b + c - hyp - side1;


        boolean case1 = (side1*side1) + (side2*side2) == (hyp*hyp);
        boolean case2 = a > 0 && b > 0 && c > 0;

        System.out.println(case1 == case2 && case1);
    }
}




