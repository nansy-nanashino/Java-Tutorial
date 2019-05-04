// Thread
//複数立ち上げれば複数の処理が同時にできる
class MyRunnable implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 500; i++) {
      System.out.print('*');
    }
  }
}

public class MyApp {

  public static void main(String[] args) {
      //繋げる決まっている
    MyRunnable r = new MyRunnable();
    //上記のrを渡してあげる
    Thread t = new Thread(r);
    t.start();

    for (int i = 0; i < 500; i++) {
        //改行抜きで表示する
      System.out.print('.');
    }
  }

}