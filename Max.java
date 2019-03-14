import java.util.Scanner;

public class Max {

    
  public void check(int a,int b,int c) {
      if(a>b){
          if(a>c){

          
          System.out.println("a is greater");}
          else{
              System.out.println("c is greater");
          }

      }
     else if (b>c){
          System.out.println("b is greater");

      }
      else{
          System.out.println("c is greater" +c);}
      }
  


 public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num  ");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        Max obj = new Max();
        obj.check(a,b,c);
        
            

    }
}