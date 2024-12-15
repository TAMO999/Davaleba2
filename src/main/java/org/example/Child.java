package org.example;

 class Child extends AbstractClass {

  public  int  countVowel (String input) {
      int count = 0;
      String vowels = "AEIOUaeiou";
      for (int i=0; i < input.length(); i++) {
          char ch= input.charAt(i);
          if (ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ||ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
              count++;
          }
      }
      return count;
  }

}
