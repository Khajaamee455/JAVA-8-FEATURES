
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Stream api introduced in java 8 it provides a powerful and expressive way to proccess collection of data 
// in a fuctional style 

// it allows for operations like filtering , mapping , reducing data which can be performed in a more declarative and readable manner 
// comapared to traditional iterative approches ..

// let see the exaplems of it ...

class StreamApi {

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // lets filter even numbers and odd numbers 

        List<Integer> findEven = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        List<Integer> findOdd = list.stream().filter(n->n % 2 != 0).collect(Collectors.toList());

        System.out.println("Even numbers:"+findEven);
        // findEven.forEach(System.out::println);
        System.out.println("Odd numbers :"+findOdd);

    }
}