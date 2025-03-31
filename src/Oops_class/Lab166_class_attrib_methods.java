package Oops_class;

public class Lab166_class_attrib_methods {
    public static void main(String[] args) {
    person p1=new person();
    person p2=new person();
    p1.vegnonveg("Veg");
    p2.vegnonveg("nonveg");
    }

    static class person {
        // Attribute | Properties |  Data Members | Instance variables
        String FirstName;
        String LastName;
        String phone;
        byte age;
        String Gender;
        String location;
        String VegNonVeg;
        Boolean IsEmployed;
        String Eyecolor;
        String Species="Homo sapiens";
        Float Salary;

        //Methods/Function/Behaviour
        //1.Without parameters but without return type
        void Greet_person(){
            System.out.println("Hello to the world of classes");
        }
        // 2. Without parameter but with return type
        String getspecies(){
            return Species;
        }


     //3.With Parameter without return type

        void vegnonveg(String vegNonVeg)
        {
            if(vegNonVeg.equals("Veg"))
            {
                System.out.println("Person is a vegetarian");
            }
            else
            {
                System.out.println("Person is a  non-vegetarian");
            }
        }


    //4. With parameter and with return type
        String Full_Name(String FirstName, String LastName)
        {
            return(FirstName+LastName);
        }


        }



}

