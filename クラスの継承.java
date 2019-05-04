class User {
  String name;

  User(String name) {
    this.name = name;
  }

  void sayHi() {
    System.out.println("hi! " + this.name);
  }
}
//子クラス（親クラスのメソッドなどが使える）
//クラス名を決めつつどこのクラスを引き継ぐかを決める
class AdminUser extends User {

  AdminUser(String name) {
    //親クラスから引き継ぐ　（一番上の　String name）
    super(name);
  }

  void sayHello() {
    System.out.println("hello! " + this.name);
  }

  // override メソッドの上書きができる
  //明示的にすることでエラーがでる
  @Override
  void sayHi() {
    System.out.println("[admin] hi! " + this.name);
  }
}

public class MyApp {

  public static void main(String[] args) {
    User tom = new User("tom");
    System.out.println(tom.name);
    tom.sayHi();

    AdminUser bob = new AdminUser("bob");
    System.out.println(bob.name);
    //親クラスのメソッドも使える
    bob.sayHi();
    bob.sayHello();
  }

}
