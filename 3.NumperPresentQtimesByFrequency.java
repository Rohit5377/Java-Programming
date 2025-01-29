import java.util.Scanner;
class NumperPresentQtimesByFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,3,54,67,800,500,400};
        int[] frequency=new int[(int)1e9];
        for(int i=0;i<arr.length;i++){
            frequency[arr[i]]++;
        }
        int q=5;
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            if(frequency[x]>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
