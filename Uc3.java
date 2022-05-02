import java.util.Scanner;
public class Uc3 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Email");
            String userName = sc.nextLine();
            String regularExpression = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
            if (userName.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
}
