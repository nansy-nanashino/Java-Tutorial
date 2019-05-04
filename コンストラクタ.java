class User {
  String name;

  // constructor　必ず最初に呼ばれる処理
  User(String name) {
    //name フィールドがインスタンスされた時（new User("Tom")）
    //このname（上のString name）に来たものはnameに入れる
    this.name = name;
  }

  // this()

  User() {
    // this.name = "Me!";
    //このクラスのコンストラクタ
    //引数がない状態でインスタンスした場合
    //引数が一つの別のコンストラクタを呼ぶ
    //そこのthis.~に値を設定する
    this("Me!");
  }

  void sayHi() {
    System.out.println("hi! " + this.name);
  }
}

public class MyApp {

  public static void main(String[] args) {
    User tom;
    //ユーザのtomを設定する
    // tom = new User("Tom");
    tom = new User();
    System.out.println(tom.name);
    tom.sayHi();
  }

}
