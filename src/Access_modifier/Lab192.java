package Access_modifier;

public class Lab192 {
    public static void main(String[] args) {
        Son s1 =new Son();
        s1.getGold();
    }
}

class Father{
    private int gold =10;
    protected int bhk3 =10;
    int car =1;
}

class Son extends Father{

    void getGold(){
      // System.out.println(gold);
        System.out.println(bhk3);
    }
}
