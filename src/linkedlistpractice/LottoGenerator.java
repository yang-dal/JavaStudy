package linkedlistpractice;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoGenerator {
    public static void main(String[] args) {
        List<Integer> lottoNumbers = generateLottoNumbers();
        System.out.println("Lotto Numbers: " + lottoNumbers);
    }

    private static List<Integer> generateLottoNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();

        while (numbers.size() < 6) {
            int number = random.nextInt(45) + 1; // 1 to 45
            numbers.add(number);
        }

        return new ArrayList<>(numbers);
    }
}