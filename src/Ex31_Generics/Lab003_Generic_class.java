package Ex31_Generics;

public class Lab003_Generic_class {
    public static void main(String[] args) {
        GenericClass<Integer> intObjRef = new GenericClass<>(5);
        GenericClass<String> stringObjRef = new GenericClass<>("Pramod");

        // T -> it is placeholder only -> it can be any data type.

    }
}
class GenericClass<T>{
    private T data;

    public GenericClass(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

}
