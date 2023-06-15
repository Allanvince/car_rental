import java.util.Arrays;
import java.util.Scanner;

public class CarImpl implements CarInter{
    Scanner sc = new Scanner(System.in);
//Main main = new Main();

public void check(String[]sub, String x){
    boolean test
            = Arrays.asList(sub)
            .contains(x);
    if (test){
       System.out.printf("The vehicle %s is available", x);
       if (x.equals( "Impreza")){
           System.out.println("""
                   1.Maximum power\t100 - 280ps
                   2.Fuel Consumption\t10 - 15km/L
                   3.Drive Type\tAWD/FF
                   4.Engine Capacity\t1,493 - 1,995cc
                   5.Number of Seats\t5
                   6.Rental price\tKsh 4000 per day""");
       } else if (x.equals("Forester")) {
           System.out.println("""
                   1.Maximum power\t230 - 233.1ps
                   2.Fuel Consumption\t15 - 20km/L
                   3.Drive Type\tAWD/FF
                   4.Engine Capacity\t1,493 - 1,995cc
                   5.Number of Seats\t5
                   6.Rental price\tKsh 4500 per day""");
       }
   }

}
    public void check2(String[]bmw, String y){
        boolean test
                = Arrays.asList(bmw)
                .contains(y);
        if (test){
            System.out.printf("The vehicle %s is available", y);
            if (y.equals( "Impreza")){
                System.out.println("""
                        1.Maximum power\t100 - 280ps
                        2.Fuel Consumption\t10 - 15km/L
                        3.Drive Type\tAWD/FF
                        4.Engine Capacity\t1,493 - 1,995cc
                        5.Number of Seats\t5
                        6.Rental price\tKsh 4000 per day""");
            } else if (y.equals("Forester")) {
                System.out.println("""
                        1.Maximum power\t230 - 233.1ps
                        2.Fuel Consumption\t15 - 20km/L
                        3.Drive Type\tAWD/FF
                        4.Engine Capacity\t1,493 - 1,995cc
                        5.Number of Seats\t5
                        6.Rental price\tKsh 4500 per day""");
            }
        }

    }
    public void check3(String[]sub, String x){
        boolean test
                = Arrays.asList(sub)
                .contains(x);
        if (test){
            System.out.printf("The vehicle %s is available", x);
            if (x.equals( "Impreza")){
                System.out.println("""
                        1.Maximum power\t100 - 280ps
                        2.Fuel Consumption\t10 - 15km/L
                        3.Drive Type\tAWD/FF
                        4.Engine Capacity\t1,493 - 1,995cc
                        5.Number of Seats\t5
                        6.Rental price\tKsh 4000 per day""");
            } else if (x.equals("Forester")) {
                System.out.println("""
                        1.Maximum power\t230 - 233.1ps
                        2.Fuel Consumption\t15 - 20km/L
                        3.Drive Type\tAWD/FF
                        4.Engine Capacity\t1,493 - 1,995cc
                        5.Number of Seats\t5
                        6.Rental price\tKsh 4500 per day""");
            }
        }

    }
    public void check4(String[]toyota, String t){
        boolean test
                = Arrays.asList(toyota)
                .contains(t);
        if (test){
            System.out.printf("The vehicle %s is available", t);
            if (t.equals( "Impreza")){
                System.out.println("""
                        1.Maximum power\t100 - 280ps
                        2.Fuel Consumption\t10 - 15km/L
                        3.Drive Type\tAWD/FF
                        4.Engine Capacity\t1,493 - 1,995cc
                        5.Number of Seats\t5
                        6.Rental price\tKsh 4000 per day""");
            } else if (t.equals("Forester")) {
                System.out.println("""
                        1.Maximum power\t230 - 233.1ps
                        2.Fuel Consumption\t15 - 20km/L
                        3.Drive Type\tAWD/FF
                        4.Engine Capacity\t1,493 - 1,995cc
                        5.Number of Seats\t5
                        6.Rental price\tKsh 4500 per day""");
            }
        }

    }
    public void check5(String[]nissan, String n){
        boolean test
                = Arrays.asList(nissan)
                .contains(n);
        if (test){
            System.out.printf("The vehicle %s is available", n);
            if (n.equals( "Impreza")){
                System.out.println("""
                        1.Maximum power\t100 - 280ps
                        2.Fuel Consumption\t10 - 15km/L
                        3.Drive Type\tAWD/FF
                        4.Engine Capacity\t1,493 - 1,995cc
                        5.Number of Seats\t5
                        6.Rental price\tKsh 4000 per day""");
            } else if (n.equals("Forester")) {
                System.out.println("""
                        1.Maximum power\t230 - 233.1ps
                        2.Fuel Consumption\t15 - 20km/L
                        3.Drive Type\tAWD/FF
                        4.Engine Capacity\t1,493 - 1,995cc
                        5.Number of Seats\t5
                        6.Rental price\tKsh 4500 per day""");
            }
        }

    }
    public void choice(){
        System.out.println("Enter choice: ");
        int choices = sc.nextInt();

        switch (choices) {
            case 1 -> {
                System.out.print("Enter the subaru model:  ");
                String x = sc.next();
                String[] sub = {"Impreza", "Forester", "Crosstrek", "Ascent", "Outback", "Legacy", "WRX"};
                check(sub, x);
            }
            case 2 -> {
                System.out.print("Enter the BMW model: ");
                String y = sc.next();
                String[] bmw = {"X-series", "2-series", "3-series"};
                check2(bmw, y);
            }
            case 3 -> {
                System.out.print("Enter the mercedes model: ");
                String z = sc.next();
                String[] merce = {"C200", "E250", "S550", "GLE"};
                check3(merce, z);
            }
            case 4 -> {
                System.out.print("Enter the Range rover model: ");
                String r = sc.next();
                String[] range = {"Sport", "Vogue", "Evoque"};
                check4(range, r);
            }
            case 5 -> {
                System.out.print("Enter the toyota model: ");
                String t = sc.next();
                String[] toyota = {"Sedans", "SUV", "Sport"};
                check5(toyota, t);
            }
            case 6 -> {
                System.out.print("Enter the nissan model: ");
                String n = sc.next();
                String[] nissan = {"Sedans", "SUV", "Sport"};
                check5(nissan, n);
            }
        }
    }
}
