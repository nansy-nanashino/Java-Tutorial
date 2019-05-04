public class MyApp {

  public static void main(String[] args) {
    // switch
    String signal = "green";
    switch (signal) {
      case "red":
        System.out.println("stop!");
        break;
        //BlueまたはGreenの場合の処理
      case "blue":
      case "green":
        System.out.println("go!");
        break;
      case "yellow":
        System.out.println("caution!");
        break;
        //上記以外の処理（default）
      default:
        System.out.println("wrong signal!");
        break;
    }
  }
}
