// static

class User {
  private String name;
  //staticにすることで個別設定できる（tomやbob単体ではなくクラスに引っ付いたもの）
  private static int count = 0; // クラス変数

  public User(String name) {
    this.name = name;
    User.count++;
  }
//staticの値を取り出す（取り出すだけしかできない）
  public static void getInfo() { // クラスメソッド
    System.out.println("# of instances: " + User.count);
  }

}

public class MyApp {

  public static void main(String[] args) {
    User.getInfo(); // 0
    User tom = new User("tom");
    User.getInfo(); // 1
    User bob = new User("bob");
    User.getInfo(); // 2
  }

}