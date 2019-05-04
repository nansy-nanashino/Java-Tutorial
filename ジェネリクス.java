// generics
//汎用化されたデータ型でクラスやインターフェースを作ることができる


// class MyInteger {
//int であるためdoubleなどが入らないため汎用化させる
//   public void getThree(int x) {
//     System.out.println(x);
//     System.out.println(x);
//     System.out.println(x);
//   }
// }

//どのデータ型にも対応できるようになる
class MyData<T> {
  public void getThree(T x) {
    System.out.println(x);
    System.out.println(x);
    System.out.println(x);
  }
}

public class MyApp {

  public static void main(String[] args) {
    // MyInteger mi = new MyInteger();
    // mi.getThree(55);
    //実行時に型をつける（参照型しか使えない）
    MyData<Integer> i = new MyData<>();
    i.getThree(32);
    MyData<String> s = new MyData<>();
    s.getThree("hello");
  }

}