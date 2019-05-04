import java.util.*;

public class MyApp {

  public static void main(String[] args) {
    // Stream 複数の値を順番に処理していくための仕組み
    //宣言と同時に値を入れ込む
    List<Integer> sales = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));
    // for (Integer sale : sales) {
    //   System.out.println(sale);
    // }

    sales
      .stream()
      // 中間処理
      .filter(e -> e % 3 == 0) // ラムダ式 引数 -> 処理
      .map(e -> "(" + e + ")")
      // 終端処理　メソッド参照
      .forEach(System.out::println);

  }

}