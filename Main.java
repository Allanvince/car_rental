import java.util.Objects;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public void menu(){
        System.out.println("login Successful!!");
        System.out.println("""
                                1.Subaru\s
                                 2.Volvo\s
                                 3.Mercedes\s
                                 4.Range Rover\s
                                 5.Toyota\s
                                 6.Nissan\s
                                 7.Exit""");
    }
    public void choice(){
        System.out.println("Enter choice: ");
        int choices = sc.nextInt();

        switch (choices){
            case 1:
                
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Main main = new Main();
        Car car = new Car();
        CarImpl impl = new CarImpl();

        String pass = "a1man";
        String user = "vince";

        System.out.println("Welcome to Vince Car Rental place :)");
        System.out.println("1.Sign up\n2.Login");
        int ans = sc.nextInt();

        if (ans == 1) {
            System.out.println("Welcome to Vince Car rental");
            System.out.println("Please enter your username: ");
            String userName = sc.next();

            System.out.println("Please set your password: ");
            String newPass = sc.next();
            System.out.println("Confirm your password: ");
            String confirmPass = sc.next();

            if (confirmPass.equals(newPass)){
                System.out.println("login Successful!!");
                while (true){
                    main.menu();
                }
            }
            else {
                int count = 2;
                while (count > 0 ){
                    System.out.println("Wrong confirmation!! Try again: ");
                    confirmPass = sc.next();
                    count -= 1;
                }
            }


        } else if (ans == 2) {
            System.out.println("Enter your username: ");
            car.setUserName(sc.next());

            System.out.println("Enter your password: ");
            car.setPassword(sc.next());

                if ((user.equals(car.getUserName()) & (pass.equals(car.getPassword())))){
                        while (true){
                            main.menu();
                        }
            }
                else {
                    System.exit(0);
                }

    }


    }
}