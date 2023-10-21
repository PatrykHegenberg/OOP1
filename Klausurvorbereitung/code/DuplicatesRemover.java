//package Klausurvorbereitung.code;

import java.util.ArrayList;

class DuplicatesRemover {
  public static void removeDuplicates(ArrayList<Character> arrList) {
      ArrayList<Character> newList = new ArrayList<Character>();
      System.out.println(arrList.size());
      for(int i = 0; i < arrList.size(); i++){
        System.out.println(i);
        System.out.println(i + ":" + arrList.get(i));
        if(!newList.contains(arrList.get(i))){
          newList.add(arrList.get(i));
          System.out.println(arrList.get(i) + " : Gefunden wird entfernt");
        } else {
          System.out.println(arrList.get(i) + " : Nicht Gefunden wird nicht entfernt");
        }
      }
      arrList.clear();
      arrList.addAll(newList);
    }

    public static void main(String[] args) {
        ArrayList<Character> arrList = new ArrayList<Character>();
        arrList.add('a');
        arrList.add('b');
        arrList.add('b');
        arrList.add('c');
        arrList.add('c');
        arrList.add('c');
        arrList.add('d');
        removeDuplicates(arrList);
        for(int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
    }
}