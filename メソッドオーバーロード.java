public class MyApp {

  public static void sayHi(String name) {
    //sayhiないで定義された変数のため外で呼び出してもエラーになる
    // int x = 10;
    System.out.println("Hi! " + name);
  }

  // overload
  //引数さえ違えば同じ名前でメソッドが作れる
  public static void sayHi() {
    System.out.println("Hi! Nobody!");
  }

  public static void main(String[] args) {
    sayHi();
    sayHi("Steve"); // 引数
    //スコープ外のためエラーになる
    // System.out.println(name);
    // System.out.println(x);
  }

}
