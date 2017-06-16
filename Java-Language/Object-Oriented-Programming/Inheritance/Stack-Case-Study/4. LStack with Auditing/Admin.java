package com.rajeshpatkar;

public class StackCaseStudy {
    public static void main(String[] args) {
      AStack s1 = new AStack();
      Client1.useAStack(s1);
      Client1.AuditorAStack(s1);
      s1.print();
      LStack s2 = new LStack();
      Client2.useLStack(s2);
      Client2.AuditorLStack(s2);
      s2.print();
    }
}
