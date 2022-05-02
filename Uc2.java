import java.util.Scanner;
public class Uc2 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your first name");
            String userName1 = sc.nextLine();
            System.out.println("Enter your last name");
            String userName2 = sc.nextLine();
            String regularExpressionFirstName = "^[A-Z][a-z]{3,}$";
            String regularExpressionLastName = "^[A-Z][a-z]{3,}$";

            if (userName1.matches(regularExpressionFirstName)) {
                if(userName2.matches(regularExpressionLastName)){

                }
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }
    }

