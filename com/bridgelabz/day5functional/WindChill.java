package com.bridgelabz.day5functional;

public class WindChill {
    public static void main(String[] args){

        System.out.println(args[0]);
        System.out.println(args[1]);
        double t =Double.parseDouble((args[0]));
        double v =Double.parseDouble((args[1]));

        if(t<=50 && v>3 && v<=120){
            double w = (float) (35.74 + (0.6215 * t) + ((0.4275 * t) -35.75)*(Math.pow(v, 0.16)));
            System.out.println("the wind chill: " + w);
        }else {
            System.out.println("please Enter temperature till 50 and wind speed between 3 to 120");
        }
    }
}
