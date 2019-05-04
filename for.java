public class MyApp {

  public static void main(String[] args) {
    // for
    // 0 - 9
    // break　ループを抜ける
    // continue　その時に処理を飛ばす
    //初期化処理が必要
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        // break;
        continue;
      }
      System.out.println(i);
    }
  }

}
