package Access_modifier.Police;

public class Cop {
    private int gun;
    String iCard;

    public Cop(){
        System.out.println("this is default constructor");
    }

   // Param Con
    public Cop(int bullet){
        this.gun = bullet;
    }

    // Method / Behav
    protected void canIShoot(){
        System.out.println("Yes You can shoot!");
    }
}
