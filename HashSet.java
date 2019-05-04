//HashSet 、ArrayList 同様複数のデータを扱うもの、重複を許さない点とデータを保持する順番が定まらない点が異なりる
import java.util.*;

public class MyApp {

  public static void main(String[] args) {
    // HashSet  順番が不定
    // TreeSet  値順にソート
    // LinkedHashSet  追加された順を保持する

    // HashSet<Integer> sales = new HashSet<>();
    Set<Integer> sales = new HashSet<>();


    sales.add(10);
    sales.add(20);
    sales.add(30);
    //重複できないので追加できない
    sales.add(10);

    System.out.println(sales.size()); // 3

//順番が定まってない（取り出せない）
    for (Integer sale : sales) {
      System.out.println(sale);
    }

    sales.remove(30);

    for (Integer sale : sales) {
      System.out.println(sale);
    }
  }

}