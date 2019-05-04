public class MyApp {

  public static void main(String[] args) {
    // 配列
    //初期化する
    // sales1, sales2, ...
    // sales

    // int[] sales;
    // sales = new int[3];

    // int[] sales;
    //０から始まり添字がかっていに割り当てられる
    // sales = new int[] {100, 200, 300};

    int[] sales = {100, 200, 300};

    // sales[0] = 100;
    // sales[1] = 200;
    // sales[2] = 300;
    System.out.println(sales[1]); // 200
    //書き換えることもできる
    sales[1] = 1000;
    System.out.println(sales[1]); // 1000
  }

}
