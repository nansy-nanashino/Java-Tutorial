public class MyApp {

  public static void main(String[] args) {
    // int x = 10;
    // int y = x;
    // y = 5;
    // System.out.println(x);
    // System.out.println(y);

    //メモリ領域の場所を示しているため元のデータが書き換わるためaも書き換わった値になる
    // int[] a = {3, 5, 7};
    // int[] b = a;
    // b[1] = 8;
    // System.out.println(a[1]);　　８
    // System.out.println(b[1]);　　８

    String s = "hello";
    String t = s;
    t = "world";
    System.out.println(s);
    System.out.println(t);
  }

}
