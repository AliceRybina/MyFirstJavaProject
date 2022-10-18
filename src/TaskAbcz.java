import java.util.Scanner;

public class TaskAbcz {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Type a number:");
        int x = myObj.nextInt();
        System.out.println("Type another number:");
        int y = myObj.nextInt();
        if (x<y) {
            System.out.println("alpha");
        } else if (x<0) {
            System.out.println("bravo");
        } else if (y==0) {
            System.out.println("charlie");
        } else {
            System.out.println("zulu");
        }
    }
}
