class User {
  private String name;
  private int score;

  public User(String name, int score) {
    this.name = name;
    this.score = score;
  }
//https://nobuo-create.net/java-beginner-22/
//https://nobuo-create.net/java-beginner-23/#i-2   参照
//privateになっているため他からアクセスできなくなる（整合性は取れる）
//そのためただ値を取ってくるだけの仕組みを作らないとscoreの中身が見れなくなる
  public int getScore() { // getter
    return this.score;
  }
//privateにしているため直接書き換えができなくなる（不正な書き換えができなくなる）
//だが書き換わるようなもの（点数）など更新の必要なものだけ書き換えれるようにする
//（ただし条件判定などで入力制限をつけ不正な入力をなくす）
  public void setScore(int score) { // setter
    if (score > 0) {
      this.score = score;
    }
  }

}

public class MyApp {

  public static void main(String[] args) {
    User tom = new User("tom", 65);
    tom.setScore(85);
    tom.setScore(-22);
    System.out.println(tom.getScore());
  }

}