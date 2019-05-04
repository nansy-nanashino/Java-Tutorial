//データの管理　keyとvalue
import java.util.*;

public class MyApp {

  public static void main(String[] args) {
    // HashMap: key value  データは不順
    // TreeMap   keyの順番
    // LinkedHashMap  データが追加された順番

    // HashMap<String, Integer> sales = new HashMap<>();
    Map<String, Integer> sales = new HashMap<>();

    sales.put("tom", 10);
    sales.put("bob", 20);
    sales.put("steve", 30);

    System.out.println(sales.get("tom")); // 10
    System.out.println(sales.size()); // 3
//全ての要素をみる
    for (Map.Entry<String, Integer> sale : sales.entrySet()) {
      System.out.println(sale.getKey() + ":" + sale.getValue());
    }
//値の更新
    sales.put("tom", 100);
    sales.remove("steve");

    for (Map.Entry<String, Integer> sale : sales.entrySet()) {
      System.out.println(sale.getKey() + ":" + sale.getValue());
    }
  }

}