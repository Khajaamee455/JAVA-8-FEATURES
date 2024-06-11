
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import  java.util.Set;
import java.util.stream.Collectors;

// Lamda expression with collections examples 


// finding duplicate values in a list .....
class Example1{

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,1,2,3,4,5,6,7,8,9);

        Set<Integer> set = new HashSet<>();
        
        List<Integer> findDuplicates = list.stream().filter(i->!set.add(i)).collect(Collectors.toList());

        findDuplicates.forEach(System.out::println);
    
    }
}

// finding duplicate values in list of string ...
class Example2{

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "javascript", "c++", "java");
        // convert this into set -> set does not store duplicate valuse 
        Set<String> set = new HashSet<>();

        List<String> findduplicate = list.stream().filter(i -> !set.add(i)).collect(Collectors.toList());

        findduplicate.forEach(System.out::println);
    }
}