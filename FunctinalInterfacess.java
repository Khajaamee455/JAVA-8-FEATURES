import  java.util.function.Consumer;
import  java.util.function.Function;
import  java.util.function.Predicate;
import java.util.function.Supplier;
// Funtional interfacess 


@FunctionalInterface
interface MyFuntionalInterface {

    void exicute();
}

// using lamda expression implimenting a functional interface

class LamdaExpression{

    public static void main(String[] args) {
        MyFuntionalInterface func = ()->System.out.println("Exicuting");
        func.exicute();
    }
}


// java 8 provides several predefind functional interfaces like consumer , predicate , function , & supplier

// in java.util.function package

class LamdaExaple1{

    public static void main(String[] args) {
        Consumer <String> printer = (s)->System.out.println(s);

        printer.accept("Hello lamda Expression");
    }
}

// Predicate Example 

class LamdaExaple2 {

    public static void main(String[] args) {
        Predicate<Integer> isEven = (n)-> n/2 == 0;

        System.out.println(isEven.test(9));
        System.out.println(isEven.test(10));
    }
}


class LamdaExaple3 {

    public static void main(String[] args) {
        Function<String , Integer > lengthFunction = (s)-> s.length();

        System.out.println(lengthFunction.apply("Hello"));      //5
    }
}


class LamdaExaple4 {

    public static void main(String[] args) {
        
        Supplier <Double > randomvalue = ()->Math.random();
        System.out.println(randomvalue.get());
    }
}