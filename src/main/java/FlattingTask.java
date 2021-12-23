import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattingTask {
    public static List<String> flatting( List<String> arr1){
        List<String> newArr1 = arr1.stream().flatMap(x -> Arrays.stream(x.split(""))).collect(Collectors.toList());
        System.out.println(newArr1);
        return newArr1;
    }
}
