/*
基本データ型に対する参照型
Wrapper Class
int -> Integer
double -> Double
*/

public class MyApp {

  public static void main(String[] args) {
    // Integer i = new Integer(32);
    // int n = i.intValue();

    Integer i = 32; // auto boxing 参照型をにする
    i = null;//どこも指し示してない　nullはunboxingできない
    int n = i; // auto unboxing 基本データ型に変える

  }

}