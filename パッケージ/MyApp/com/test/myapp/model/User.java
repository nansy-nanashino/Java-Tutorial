package com.dotinstall.myapp.model;
//publicにすることでどこからでもアクセスできる
public class User {
//protectednのため子クラスとそのクラスからならアクセスできる
  protected String name;

  public User(String name) {
    this.name = name;
  }

  public void sayHi() {
    System.out.println("hi! " + this.name);
  }
}