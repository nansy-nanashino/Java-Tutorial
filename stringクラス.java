public class MyApp {

    public static void main(String[] args) {
      String s = "abcdef";
      System.out.println(s.length()); // 6 文字数（色々な数）
      System.out.println(s.substring(2, 5)); // cde 部分文字列
      System.out.println(s.replaceAll("ab", "AB")); //文字列の置換
  
      String s1 = "ab";
      String s2 = "ab";
  //文字列が同じかどうかみる
      if (s1.equals(s2)) {
        System.out.println("same!");
      }
  //文字列の場合基本データ
      if (s1 == s2) {
        System.out.println("same!same!");
      }
  //明示的にメモリ領域を定義
      String ss1 = new String("ab");
      String ss2 = new String("ab");
  //メモリ領域の比較になるため同じじゃないと出る
      if (ss1 == ss2) {
        System.out.println("same!same!same!");
      }
    }
  
  }