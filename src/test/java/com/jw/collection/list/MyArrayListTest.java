package com.jw.collection.list;

import com.jw.collection.list.arraylist.MyArrayList;
import org.junit.jupiter.api.Test;

class MyArrayListTest {

  @Test
  void add() {
    MyArrayList<Integer> list = new MyArrayList<>();
    for (int i = 0; i < 2000; i++) {
      list.add(i);
    }
    System.out.println(list);
  }
  @Test
  void add2() {
    MyArrayList<Integer> list = new MyArrayList<>();
    for (int i = 0; i < 2; i++) {
      list.add(i);
    }
    list.add(2, 1);
  }

  @Test
  void set() {
    MyArrayList<Integer> list = new MyArrayList<>();
    for (int i = 0; i < 2; i++) {
      list.add(i);
    }
    list.set(2, 1);
  }

  @Test
  void get() {
    MyArrayList<Integer> list = new MyArrayList<>();
    for (int i = 0; i < 2000; i++) {
      list.add(i);
      System.out.println(list.get(i));
    }
  }

  @Test
  void size() {
    MyArrayList<Integer> list = new MyArrayList<>();
    for (int i = 0; i < 2000; i++) {
      list.add(i);
      System.out.println(list.size());
    }
  }
}