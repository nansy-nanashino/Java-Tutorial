public class MyApp {

  public static void main(String[] args) {
    // 配列
    // sales.length salesの配列要素の数を数えてくれる
    int[] sales = {700, 400, 500};

    // for (int i = 0; i < 3; i++) {
    // for (int i = 0; i < sales.length; i++) {
    //   System.out.println(sales[i]);
    // }

//salesの中のも1つづつ取り出してsaleに代入それが終わるまでSystem~の処理をする
//sales[0]->sale[0]
//System.out.println(sale)
//sales[1]->sale[1]
//System.out.println(sale)...
//sales[i]->sale[i]
//System.out.println(i)
    for (int sale : sales) {
      System.out.println(sale);
    }
  }

}
