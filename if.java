public class MyApp {

  public static void main(String[] args) {
    // if
    // > 〜より大きい
    //>= 〜以上
    //< 　〜より小さい
    //<=　〜以上
    // ==　等しい
    // !=　等しくない
    // && || !　and or not
    int score = 95;
    // if (score > 80) {
    //   System.out.println("Great!");
    // } else if (score > 60) {
    //   System.out.println("Good!");
    // } else {
    //   System.out.println("so so ... !");
    // }
    //条件分岐されたものを代入　比較？true:false
        String msg = score > 80 ? "Great!" : "so so ... !";
    System.out.println(msg);
  }

}
