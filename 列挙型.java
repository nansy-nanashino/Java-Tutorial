// 列挙型
//定数をまとめたもの

enum Result {
//ordinalという０から始まる連番で番号が割り当てられる
//クラス扱いでもあるのでフィールドやメソッドを持つこともできる
  SUCCESS, // 0
  ERROR, // 1
}

public class MyApp {

  public static void main(String[] args) {
    Result res;

    res = Result.ERROR;

    switch (res) {
      case SUCCESS:
        System.out.println("OK!");
        System.out.println(res.ordinal()); // 0
        break;
      case ERROR:
        System.out.println("NG!");
        System.out.println(res.ordinal()); // 1
        break;
    }

  }

}