public class MyApp {

  // method

  // public static void sayHi() {
  // public static void sayHi(String name) {
          //メソッド名（関数）を決める
          //返すデータの型を書く（returnの場合）
          //voidは何も返さない
          //変数を入れることでその変数内のものをメソッドで使える
  public static String sayHi(String name) {
    //処理をかく

    // System.out.println("Hi!");
    // System.out.println("Hi! " + name);
    return "Hi! " + name;
  }

  public static void main(String[] args) {
    // sayHi();
    // sayHi("Tom");
    // sayHi("Bob");
    String msg = sayHi("Steve");
    System.out.println(msg);
  }

}
