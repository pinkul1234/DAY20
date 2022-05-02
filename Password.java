import java.util.Scanner;
public class Password {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name");
            String userName = sc.nextLine();
            String regularExpression = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
            if (userName.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }
    }

