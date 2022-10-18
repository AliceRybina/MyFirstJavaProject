public class TaskMax4 {
    public static void main(String args[]){
        int firstNum = 15;
        int secNum = 16;
        int thirdNum = 17;
        int forthNum = 20;
        int maxFour = Math.max(Math.max(firstNum,secNum), Math.max(forthNum,thirdNum));
        System.out.println(maxFour);
    }
}
