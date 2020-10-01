import java.util.*;
class Costfunc {
  static int input(){
    Scanner student_count = new Scanner(System.in);
    int student_count2;
    student_count2 = student_count.nextInt();
    return student_count2;
  }
  static float pricecal(int c){
    float[] price = {500,450,400,350,300};
    float netprice=0;
    if(c==1){
      netprice = c*price[0];
    }
    else if(c==2){
      netprice = c*price[1];
    }
    else if(c==3){
      netprice = c*price[2];
    }
    else if(c==4){
      netprice = c*price[3];
    }
    else if(c >= 5){
      netprice = c*price[4];
    }
    else{
      System.out.println("Something Wrong! Stop Working");
      System.exit(0);
    }
    return netprice;
  }
  static String moneyPayment(float p,int s){
    float eachPrice = p/s,cost_paid2;
    Scanner cost_paid = new Scanner(System.in);
    Scanner name_paid = new Scanner(System.in);
    String x2,name_paid2 ;
    Scanner x = new Scanner(System.in);

    Dictionary dictionary = new Hashtable();

    for (int i=0;i<s;i++){
      System.out.print("Add name of "+(i+1)+" Student :");
      x2 = x.nextLine();
      dictionary.put(x2,eachPrice);
      System.out.println("Student : "+x2+" Cost = "+dictionary.get(x2));

    }


    float red;
    while(dictionary.size()!=0){
      System.out.println(dictionary);
      System.out.println("Add your name for payment : ");
      name_paid2 = name_paid.nextLine();
      System.out.println("Add your money you paid : ");
      cost_paid2 = cost_paid.nextFloat();

      red = (float) dictionary.get(name_paid2)-cost_paid2;
      dictionary.put(name_paid2,red) ;
      if((float)dictionary.get(name_paid2)==0.0){
        dictionary.remove(name_paid2);
      }
      else if((float)dictionary.get(name_paid2)< 0.0){
        System.out.println("return change = "+((-1)*(float)dictionary.get(name_paid2)));
        dictionary.remove(name_paid2);
      }
      System.out.println("Students Balance");
    }
    return "Open Class!!!\n";
  }
  }
