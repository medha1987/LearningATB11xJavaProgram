package Ex31_Generics;

public class Lab002_Generics_fix {
    public static void main(String[] args) {

       // temp_sum(3,4);
       // temp_sum(3.34,4.45);
       // temp_sum("Pramod","Dutta");
       // Generic Type - Integer
        Addition<Integer> addInt = new Addition<Integer>();
        System.out.format("Integer sum is %d%n", (addInt.temp_sum(2, 3)));
        // Generic Type - Float
        Addition<Float> addFloat = new Addition<Float>();
        System.out.format("Float sum is %f%n", addFloat.temp_sum(2.3f, 3.2f));
        // Generic Type - Double
        Addition<Double> addDouble = new Addition<Double>();
        System.out.format("Double sum is %2f%n", addDouble.temp_sum(2.37577, 3.25588));
    }
}

class Addition<T extends Number> {
    public T temp_sum(T a, T b) {
        if (a instanceof Integer) {
            return (T) ((Integer) Integer.sum((Integer)a, (Integer)b));
        } else if (a instanceof Float) {
            return (T) ((Float) Float.sum((Float)a, (Float)b));
        } else if (a instanceof Double) {
            return (T) ((Double) Double.sum((Double)a, (Double)b));
        }
        // Default value
        return a;
    }
}