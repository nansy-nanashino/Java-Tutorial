// final: 変更ができない
//クラスが継承できなくなる
final class User {
  protected String name;
  //定数になる
  private static final double VERSION = 1.1;

  public User(String name) {
    this.name = name;
    User.VERSION = 1.2;
  }
//overrideできなくなる
  public final void sayHi() {
    System.out.println("hi! " + this.name);
  }
}

class AdminUser extends User {

  public AdminUser(String name) {
    super(name);
  }

  @Override
  public void sayHi() {
    System.out.println("[admin] hi! " + this.name);
  }

}

public class MyApp {

  public static void main(String[] args) {
    User tom = new User("tom");
  }

}