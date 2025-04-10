package Ex29_Wrapper_Class;

public class Lab006_Wrapper_with_other_oops_concept {

    interface SIMCard{
        void enterCard();
    }
    class OldPhone implements SIMCard{

        void calling(){
            System.out.println("dialpad");
        }

        @Override
        public void enterCard() {
            System.out.println("Card entered");
        }
    }

    class Mobile extends OldPhone {
        private Integer phone;
        private String name;
        private Double price;
        static String mobile_carrier = "airtel";

        public Integer getPhone() {
            return phone;
        }

        public void setPhone(Integer phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }



        Mobile() {
            System.out.println("DC");
        }

        //Parameterised constructor
        public Mobile(Integer phone, String name, Double price) {
            this.phone = phone;
            this.name = name;
            this.price = price;
        }
        void display() {
            System.out.println(this.name + this.phone + this
                    .price);
        }
            static void switchOnAirplaneMode(){
                System.out.println("Common Airplane Mode");
            }

            void priceChange(Integer price){
                System.out.println("Change price in Integers");
            }
            void priceChange(Double price){
                System.out.println("Change price in decimals");
            }

            @Override
            void calling(){
                System.out.println("dialpad ->touch dialpad now!!");
            }

        }

    }


