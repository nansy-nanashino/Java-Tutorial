import java.time.*;
import java.time.format.DateTimeFormatter;

public class MyApp {

  public static void main(String[] args) {
    LocalDateTime d = LocalDateTime.now();
    //現在時刻のインスタンス
    // LocalDateTime d = LocalDateTime.of(2016, 1, 1, 10, 10, 10);
    //特定の日時のインスタンス
    // LocalDateTime d = LocalDateTime.parse("2016-01-01T10:10:10");

    System.out.println(d.getYear());
    //定数
    System.out.println(d.getMonth());
    //数値が帰ってくる
    System.out.println(d.getMonth().getValue());
　//2ヶ月足して3日引く
    System.out.println(d.plusMonths(2).minusDays(3));
   //好きなフォーマットて表記する
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy!MM!dd!");
    System.out.println(d.format(dtf));

  }

}