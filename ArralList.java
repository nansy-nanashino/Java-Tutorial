//配列と違い後から要素などの追加ができる
//packageのimportが必要
import java.util.*;

public class MyApp {

  public static void main(String[] args) {
    // ArrayList
    // LinkedList ☓ (遅い)検索 ◯ 追加／削除

    // ArrayList<Integer> sales = new ArrayList<>();
    List<Integer> sales = new ArrayList<>();

    sales.add(10);
    sales.add(20);
    sales.add(30);
//size要素の個数を取れる
    for (int i = 0; i < sales.size(); i++) {
      System.out.println(sales.get(i));
    }
//クラスのためset
    sales.set(0, 100);
    sales.remove(2);

    for (Integer sale : sales) {
      System.out.println(sale);
    }
  }

}