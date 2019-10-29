package ContactCreator;

import java.util.Scanner;

public class Application {
    public static Scanner scan= new Scanner(System.in);

    public  int requestRetrieveInt(String request){
        System.out.println(request);
        int x=scan.nextInt();
        scan.nextLine();
        return x;
    }

    public  String requestRetrieveString(String request){
        System.out.println(request);
        String retrieve=scan.nextLine();
        return retrieve;
    }
}
