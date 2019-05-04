// static

class User {
  private String name;
  private static int count; // クラス変数

  static {
      //クラスを使う前に初期化する
      //配列などの複雑なデータ構造する場合に必要
      //statci initializer 最初の一回初期化される
    User.count = 0;
    System.out.println("Static initializer");
  }

  {
      //インスタンスするたびに行う処理を毎回やってくれる（初期化処理など）
      //instanceするたびに実行される
    System.out.println("Instance initializer");
  }

  public User(String name) {
    this.name = name;
    User.count++;
    System.out.println("Constructor");
  }

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