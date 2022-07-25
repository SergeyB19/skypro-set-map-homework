import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numsOne = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                numsOne.add(num);
            }
        }
        System.out.println(numsOne);

        //Напишите код, с помощью которого можно напечатать только четные числа в консоль.
        List<Integer> numsEven = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numsEvenOne = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                numsEvenOne.add(num);
            }
        }
        System.out.println(numsEvenOne);


        //Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли
        Set<String> words = new LinkedHashSet<>(List.of("Bad boys", "Bad boys", "whatcha", "gonna", "do","gonna", "do"));
        System.out.println(words);

       // Напишите код, который выводит в консоль все количество дублей из списка слов.
        List<String> words1 = new ArrayList<>(List.of("Bad boys", "Bad boys", "whatcha", "gonna", "do","chuck"));
        Map<String, Integer> frequency = words1.stream().collect(Collectors.toMap(e,1, Integer::sum));

        frequency.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}




