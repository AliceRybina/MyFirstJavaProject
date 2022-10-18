public class TaskCar {
    public static void main(String args[]){
        //v1
        int carSpeed = 100;
        int speedLim = 60;
        if (carSpeed > speedLim) {
            System.out.println("violation");
        }
        else{
            System.out.println("ok");
        }
        //v2
        var msg = "";

        msg = (carSpeed>speedLim) ? "violation" : "ok";
        System.out.println(msg);
    }
}
