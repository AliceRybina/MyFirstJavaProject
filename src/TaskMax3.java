public class TaskMax3 {
    public static void main(String args[]){
        int firstNum = 2;
        int secNum = 5;
        int thirdNum = 7;
        int maxThree = Math.max(firstNum, Math.max(secNum,thirdNum));
        System.out.println(maxThree);
    }
}
