import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Hello. What is your name?");
        String userName = sn.next(); //input for user name as a string
        System.out.print("It's nice to meet you, " +userName+ ". How old are you?" );
        String userAge = sn.next(); //input for user age as an integer
        System.out.println("I see that you are still quite young at only "+userAge+".");   // comment added
        System.out.print("Where do you live?");
        String userLive = sn.next(); //input for where user lives as a string
        System.out.println("Wow! I've always wanted to go to "+userLive+". Thanks for chatting with me. Bye!");
    }
}
