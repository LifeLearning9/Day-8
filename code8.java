import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split("\\s+");
       int n1[]=new int[s1.length];
       for(int i=0;i<s1.length;i++)
       {
           n1[i]=s1[i].length();
       }
      
      int t=min(n1);
      int t1=max(n1);
      String small[]=new String[n1.length];
      String large[]=new String[n1.length];
      for(int i=0;i<s1.length;i++)
      {
          String word=s1[i];
          if(word.length()==t)
          {
              small[i]=word;
          }
         if(word.length()==t1)
         {
             large[i]=word;
         }
      }  
      System.out.println("Smallest Elements are:");
      for(int i=0;i<small.length;i++)
      {
          if(small[i]!=null)
          {
              System.out.println(small[i]);
          }
      }
      System.out.println("largest Elements are:");
      for(int i=0;i<large.length;i++)
      {
          if(large[i]!=null)
          {
              System.out.println(large[i]);
          }
      }
    }
    public static int min(int a[])
    {
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(min>a[i])
            min=a[i];
        }
        return min;
    }
    public static int max(int a[])
    {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            max=a[i];
        }
        return max;
    }
}
