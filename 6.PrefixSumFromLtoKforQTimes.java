import java.util.Scanner;

class PrefixSumFromLtoKforQTimes {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int[] arr={0,1,2,3,4,5};
         for(int i=1;i<arr.length;i++){
             arr[i]=arr[i-1]+arr[i];
         }
         int q=3;
         for(int i=1;i<=q;i++){
             int l=sc.nextInt();
             int k=sc.nextInt();
             int sum=arr[k]-arr[l-1];
             System.out.println(sum);
         }
     }

}
