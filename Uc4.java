import java.util.Scanner;
public class Uc4 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Mobile number");
            String userName = sc.nextLine();
            String regularExpression = "^[0-9]{2}[\\s][1-9][0-9]{9}$";
            if (userName.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

