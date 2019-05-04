// 抽象クラス -> 具象クラス
//abstractをつけることで抽象クラスにできる
//引き継がれることを前提としたクラス
abstract class User {
// 具象クラスで実装されなかった場合エラーになる
//実装もれ対策
  public abstract void sayHi(); // 抽象メソッド
}

class JapaneseUser extends User {
  @Override
  public void sayHi() {
    System.out.println("こんにちは！");
  }
}

class AmericanUser extends User {
  @Override
  public void sayHi() {
    System.out.println("Hi!");
  }
}

public class MyApp {

  public static void main(String[] args) {
    AmericanUser tom = new AmericanUser();
    JapaneseUser aki = new JapaneseUser();
    tom.sayHi();
    aki.sayHi();
  }

}