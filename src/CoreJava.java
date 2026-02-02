import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CoreJava {
    public static void main(String[] args) {
        /*001 */
        String firstOne = "aabcccddddee";
        Map<Character, Integer> empMap = new HashMap<>();
        for(char cr: firstOne.toCharArray()){
            if(!empMap.containsKey(cr)){
                empMap.put(cr,1);
            }else{
                empMap.put(cr,empMap.get(cr)+1);
            }
        }

        //empMap.forEach((character, value) -> System.out.println(character+": "+value));
/*----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        /* 002 */
        List<Transaction> transactions = generateMockData();
        //transactions.forEach(System.out::println);

        List<Item> itemList = transactions.stream()
                .flatMap(t -> t.getItem().stream()).filter(i -> i.getAmount() > 80).toList();

        long itemListCount = transactions.stream()
                .flatMap(t -> t.getItem().stream()).filter(i -> i.getAmount() > 80).count();


        //System.out.print(itemList);

/*---------------------------------------------------------------------------------------------------------------------------------------------------*/

        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(45);
        //System.out.println("Today's Date: " + today);
        //System.out.println("Future Date (after 45 days): " + futureDate);

        LocalDate birthday = LocalDate.of(1995,10,18);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time = LocalTime.of(14,30,0);
        System.out.println("Birthday: " + birthday);
        System.out.println("Day of the week you were born: " + birthday.getDayOfWeek());
        System.out.println("Time of Birth: " + time.format(timeFormatter));
    }

    public static List<Transaction> generateMockData() {
        // 1. Generate a stream of integers from 1 to 10 (Creating 10 Transactions)
        return IntStream.rangeClosed(1, 10)
                .mapToObj(txId -> {
                    // 2. For each transaction, generate a list of 3 Items
                    List<Item> items = IntStream.rangeClosed(1, 3)
                            .mapToObj(itemId -> new Item(
                                    itemId, // Item ID (1, 2, 3)
                                    Math.round(Math.random() * 10000.0) / 100.0 // Random amount like 45.99
                            ))
                            .collect(Collectors.toList());

                    // 3. Create the Transaction object
                    return new Transaction(txId, items);
                })
                .collect(Collectors.toList());
    }
}
