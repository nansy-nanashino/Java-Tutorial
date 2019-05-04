public class MyApp {

  public static void main(String[] args) {
    // while
    // 0 - 9
    int i = 100;
    //iを比較し条件に合っていればi++する
    //そして再度比較し、条件に合っていればi++する
    //条件に合わなくなるまで続ける
    while (i < 10) {
       System.out.println(i);
       i++;
    // }
    do {
      //条件の判定前に処理されるため一度は表記される
      System.out.println(i);
      i++;
    } while (i < 10);
  }

}
