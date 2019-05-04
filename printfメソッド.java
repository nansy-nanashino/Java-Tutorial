public class MyApp {

  public static void main(String[] args) {

    int score = 50;
    double height = 165.8;
    String name = "taguchi";
//書式を指定して表記させることができる
//%s 文字列
//%d  整数
//%f 浮動小数

// \nで改行
//%10s 右づめで10桁表示してくれる
//%-10s左づめで10桁表示してくれる
// %5.2f  整数部分を5桁　小数点部分を2桁表示
    System.out.printf("name: %s, score: %d, height: %f\n", name, score, height);
    System.out.printf("name: %-10s, score: %10d, height: %5.2f\n", name, score, height);

//文字列として受け取りたい場合
    String s = String.format("name: %10s, score: %-10d, height: %5.2f\n", name, score, height);
    System.out.println(s);
  }

}