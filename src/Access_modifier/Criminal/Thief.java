package Access_modifier.Criminal;

import Access_modifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop Thief = new Cop();
       // Thief.canIShoot();                cannot access outside package
        //System.out.println(Thief.gun);
    }
}
