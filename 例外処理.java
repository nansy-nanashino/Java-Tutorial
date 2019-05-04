// 例外
//独自のエラー設定
class MyException extends Exception {
  public MyException(String s) {
    super(s);
  }
}

public class MyApp {

  public static void div(int a, int b) {
    try {
        //例外処理を条件分岐させる
      if (b < 0) {
          //エラーのメッセージ
          //throw にし、catchに投げる
        throw new MyException("not minus!");
      }
      System.out.println(a / b);
      //元々あるエラー設定に投げる
    } catch (ArithmeticException e) {
         //eに入れeはgetMessage()を呼び出す
      System.err.println(e.getMessage());
    } catch (MyException e) {
      System.err.println(e.getMessage());
    } finally {
      System.out.println(" -- end -- ");
    }
  }

  public static void main(String[] args) {
    div(3, 0);
    div(5, -2);
  }

}