import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Map<String, Integer> groupIt(List<String> arr) {

        Map<String, Integer> map = arr.stream()
                .collect(Collectors.groupingBy(x -> String.valueOf(x.charAt(0)), HashMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, val -> Collections.frequency(FlattingTask.flatting(val.getValue()),val.getKey())));
        return map;
    }
}
