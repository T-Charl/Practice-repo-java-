import static java.lang.Math.*;

public class GreatCircle {
    public static void main(String [] args){
        double r = 6371.0;

//            double x1 = Double.parseDouble(args[0]);
//            double x2 = Double.parseDouble(args[1]);
//            double y1 = Double.parseDouble(args[2]);
//            double y2 = Double.parseDouble(args[3]);


            double x1 = 40.35;
            double x2 = 74.65;
            double y1 = 48.87;
            double y2 = -2.33;

            double sinXs = Math.sin((x2-x1)/2);
//            double sinXsSqrd = Math.pow(sinXs,2);
            double sinXsSqrd = sinXs * sinXs;

            double sinYs = Math.sin((y2-y1)/2);
//            double sinYsSqrd = Math.pow(sinYs,2);
            double sinYsSqrd = sinYs * sinYs;

            double secondPart = Math.cos(x1)*Math.cos(x2)*sinYsSqrd;

            double distance = 2*r*Math.asin(Math.sqrt(sinXsSqrd+secondPart));

            System.out.println(distance + " kilometers");
        }
    }



// ~/Desktop/hello> java GreatCircle 40.35 74.65 48.87 -2.33    // Princeton to Paris
//5902.927099258561 kilometers
//
//~/Desktop/hello> java GreatCircle 60.0 15.0 120.0 105.0      // for debugging
//4604.53989281927 kilometers
