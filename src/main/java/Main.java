import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main {
    public static void main(String ags[]){
        List<String> arr = Arrays.asList("1","2","qwert","3");
        System.out.println(MapTask.mapping(arr));



        List<String> arr1 = Arrays.asList("abac", "df","gij");

        System.out.println(FlattingTask.flatting(arr1));


        System.out.println(FizzBuzzTask.fizzBuzzIt());

        System.out.println(GroupWordsTask.groupIt(arr1));
    }
}
