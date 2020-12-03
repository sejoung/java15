package io.github.sejoung.record.ex01;

import java.util.Objects;

public record Person(String name, String address) {

  // 인자 값을 확인 가능
  public Person {
    Objects.requireNonNull(name);
    Objects.requireNonNull(address);
  }

  //수동으로 초기화 가능 위에 형태와  둘다 사용 불가능(컴파일 에러)
  /*
  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }*/

  public Person(String name) {
    this(name, "Unknown");
  }

}
