import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//    print("Hello java!", word  -> word.toUpperCase());
//
//    }
//
//    public static void print(String text, IPritable iPritable){
//        System.out.println(iPritable.execute(text));
//    }

/*1. Відфільтрувати колекцію Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
щоб в ній залишилися лише парні числа
2. Отримати колекцію Integer, яка складатиметься з розмірів стрінгів з
Arrays.asList("Cate", "Bob", "Maria");
3. Модифікувати колекцію так, щоб в ній залишились лише унікальні
елементи Arrays.asList(1, 2, 3, 3, 4, 5, 5, 5, 6);
4. Додати всі числа Arrays.asList(10, 2, 3, 4, 5);
5. Дізнатися чи є хоча би одна 8 (всі, ні одної) в колекції Arrays.asList(1, 2, 3,
4, 5, 6, 7, 8, 9, 10)
 */
        List<Integer> list = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List <Integer> filtered = list.stream().filter(num -> num%2==0).toList();

        List<String> names = Arrays.asList("Cate", "Bob", "Maria", "Bob");
        List<Integer> numbers = names.stream().map(word -> word.length()).toList();

        List<Integer> listSecond = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 5, 6);
        List<String> unique = names.stream().distinct().toList();

        List<Integer> listThird = Arrays.asList(2, 7, 5);
        //Integer sum = listThird.stream().reduce((num1, num2) -> num1+num2).orElseThrow();
        Optional<Integer> sum = listThird.stream().reduce((num1, num2) -> num1+num2);

        List<Integer> listFourth = Arrays.asList(18, 18, 18);
        boolean hasEight = listFourth.stream().anyMatch(num ->num==8);
        boolean allEight = listFourth.stream().allMatch(num -> num == 8);
        boolean noneEight = listFourth.stream().noneMatch(num -> num==8);

    }
}