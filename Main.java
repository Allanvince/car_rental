import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class  Main {
    public void menu(){
        System.out.println("login Successful!!");

        System.out.println("""
                                 1.Subaru\s
                                 2.BMW\s
                                 3.Mercedes\s
                                 4.Range Rover\s
                                 5.Toyota\s
                                 6.Nissan\s
                                 7.Exit""");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Main main = new Main();
        Car car = new Car();
        CarImpl impl = new CarImpl();

        String pass = "a1man";
        String user = "vince";

        //JUST VINCE DON'T MIND :)

        System.out.println(" \\**                **/");
        System.out.println("  \\**              **/");
        System.out.println("   \\**            **/");
        System.out.println("    \\**          **/");
        System.out.println("     \\**        **/");
        System.out.println("      \\**      **/");
        System.out.println("       \\**    **/");
        System.out.println("        \\$$$$$$$");

        System.out.println("Welcome to Vince Car Rental place :)");
        System.out.println("1.Sign up\n2.Login");
        int ans = sc.nextInt();

        if (ans == 1) {
            System.out.println("Welcome to Vince Car rental");
            System.out.print("Please enter your username: ");
            String userName = sc.next();

            Map<String, String> map = new HashMap<>();
            map.put(userName, userName);

            System.out.print("Please set your password: ");
            String newPass = sc.next();
            System.out.print("Confirm your password: ");
            String confirmPass = sc.next();

            if (confirmPass.equals(newPass)){
                System.out.println("login Successful!!");
                while (true){
                    //try-catch just for the fun of it
                    try{
                        main.menu();
                        impl.choice();
                        break;
                    }
                    catch (Exception e){
                        System.out.println("Vince");
                    }
                    finally {
                        System.out.println("**/*/*/*/*//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
                    }
                }
            }
            else {
                int count = 2;
                while (count > 0 ){
                    System.out.print("Wrong confirmation!! Try again: ");
                    confirmPass = sc.next();
                    count -= 1;
                }
            }


        } else if (ans == 2) {
            System.out.print("Enter your username: ");
            car.setUserName(sc.next());

            System.out.print("Enter your password: ");
            car.setPassword(sc.next());

                if ((user.equals(car.getUserName()) & (pass.equals(car.getPassword())))){
                            main.menu();
                            impl.choice();

            }
                else {
                    System.exit(0);
                }

    }


    }
}