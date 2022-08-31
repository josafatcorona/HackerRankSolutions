import java.util.Scanner;

class SmallestAndLargest{

  public static String getSmallestAndLargest(String s, int k){
      String smallest = "";
      String largest = "";
      largest = s.substring(0,k);
      for(int i=0; i<=s.length()-k;i++){
        if(largest.compareTo(s.substring(i,i+k))>0){

          largest = s.substring(i,i+k);
        }
      }
      for(int i=0; i<=s.length()-k;i++){
        if(smallest.compareTo(s.substring(i,i+k))<0){
          smallest = s.substring(i,i+k);
        }
      }

      return(largest+"\n"+smallest);
  }
  public static String getSmallestAndLargest2(String s, int k){
      String smallest = "";
      String largest = "";
      java.util.List<String> a = new java.util.ArrayList<>();
      for(int i = 0; i<s.length()-k+1;i++){
        a.add(s.substring(i,i+k));
      }
      java.util.Collections.sort(a);
      smallest= a.get(0);
      largest = a.get(a.size()-1);
    return smallest + "\n" + largest;
  }


  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String s = scan.next();
      int k = scan.nextInt();
      scan.close();

      System.out.println(getSmallestAndLargest2(s, k));
  }
}
