// Thread

// class MyRunnable implements Runnable { 
//抽象メソッドを一つだけ持つインターフェースのことを入力に対して出力が一つだけに定まるという意味で「関数型インターフェース」
// 関数型インターフェース
//   @Override
//   public void run() {
//     for (int i = 0; i < 500; i++) {
//       System.out.print('*');
//     }
//   }
// }

public class MyApp {

  public static void main(String[] args) {
    // MyRunnable r = new MyRunnable();
    // Thread t = new Thread(r);
    // t.start();

    // ラムダ式
    //無名クラス
    // (引数) -> {処理}
    // new Thread(new Runnable() {
    //   @Override
    //   public void run() {
    //     for (int i = 0; i < 500; i++) {
    //       System.out.print('*');
    //     }
    //   }
    // }).start();
    new Thread(() -> {
      for (int i = 0; i < 500; i++) {
        System.out.print('*');
      }
    }).start();

    for (int i = 0; i < 500; i++) {
      System.out.print('.');
    }
  }

}