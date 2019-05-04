//ランダムクラスでもランダムな値を生成できる
//importする必要がある
import java.util.Random;

public class MyApp {

  public static void main(String[] args) {
    double d = 53.234;
    System.out.println(Math.ceil(d)); // 54  切り上げ
    System.out.println(Math.floor(d)); // 53 切り上げ
    System.out.println(Math.round(d)); // 53 四捨五入
    System.out.println(Math.PI); //円周率
    // Math.random() ランダム

    Random r = new Random();
    System.out.println(r.nextDouble()); // 0 - 1
    System.out.println(r.nextInt(100)); // 0 - 100
    System.out.println(r.nextBoolean()); //真偽
  }

}