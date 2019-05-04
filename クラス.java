class User {
  String name = "Me!"; // フィールド

  void sayHi() {
    System.out.println("hi!");
  }
}

public class MyApp {

  public static void main(String[] args) {
    // int x;
    // String s;

    // Class
    User tom;
    //メモリ上に参照型として格納してくれる
    tom = new User(); // インスタンス
    System.out.println(tom.name);
    tom.sayHi();
  }

}
