package Latihan_mandiri;
import java.util.ArrayList;
public class foreacharraylist {
   

    static int index = 0;

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach((n)->{
        System.out.println(n+" di index "+index);
    index++;
} );
  }
}


