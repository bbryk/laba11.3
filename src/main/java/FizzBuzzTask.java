import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<String> fizzBuzzIt() {
        List<Integer> arr2 = IntStream.range(1,100).boxed().collect(Collectors.toList());
        List<String> newArr2 = arr2.stream().map(x -> {
            if (x %3 ==0 && x%5 == 0){
                return "FizzBuzz";
            }else if(x%3==0){
                return "Fizz";
            }else if (x%5==0){
                return "Buzz";
            }else{
                return x.toString();
            }
        }).collect(Collectors.toList());
        return newArr2;
    }
}
