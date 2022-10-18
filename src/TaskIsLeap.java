public class TaskIsLeap {
    public static void main(String args[]){

        int shortYear = 365;
        int longYear = 366;
        int a = 365;


        if (a == shortYear) {
            System.out.println("It's not a leap year");

        }

        else if (a == longYear) {
            System.out.println("It's a leap year");
        }

        else{
            System.out.println("Invalid param");
        }
    }
}
