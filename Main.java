import java.util.*;
class Main {
  public static void main(String[] args) {
    while(true){
      float rePricecal;
      Costfunc student = new Costfunc();
      int student_counter;
      System.out.print("Please add your number of Student :");
      student_counter = Costfunc.input();
      System.out.println("Your Student is "+student_counter);
      rePricecal = Costfunc.pricecal(student_counter);
      System.out.println("All Price is "+rePricecal);
      
      System.out.println("Each student Price is "+(Costfunc.pricecal(student_counter)/student_counter));
      System.out.print(Costfunc.moneyPayment(rePricecal, student_counter));
      
    }
  }
}