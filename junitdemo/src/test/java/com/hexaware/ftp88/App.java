package com.hexaware.ftp88;


/**
 * Hello world!
 * 
 */
public class App
{
    public static boolean even(int x){
      if(x %2 ==0) {
          return true;
      }
      else {
          return false;
      }
    }
    public static int max(int a,int b,int c) {
        int m = a;
        if(m<b) {
            m = b ;
        }
        if(m<c) {
            m = c;
        }
        return m;
    }
    public static int sum(int x, int y) 
    {
        return x + y;
    }
    public static String sayHello() {
        return "welcome";
}
}
