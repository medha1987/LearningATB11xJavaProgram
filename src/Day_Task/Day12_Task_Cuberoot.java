package Day_Task;

public class Day12_Task_Cuberoot {

    public static void main(String[] args) {
        double x=10.0;
        double sqx=Math.pow(x,2);
        double y=20.0;
        double sqy=Math.pow(y,2);
        double z=300.0;
        double abso= Math.abs(z);
        double result=Math.cbrt((sqx+sqy-abso));
        System.out.println(result);
    }

}
