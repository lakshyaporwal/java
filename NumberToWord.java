import java.util.Scanner;
public class NumToWord{
    public static void threedigit(int n){
        Scanner sc= new Scanner(System.in);
        int up = n%10;
        int t=n/10;
        int tenp=t%10;
        int h =n/100;
        String []arr={"Zero ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
                "Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String [] arr1={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String hun="Hundred";
        if(n<20)
            System.out.println(arr[n]);
        else if(n<100)
            System.out.println(arr1[tenp]+" "+arr[up]);
        else
            System.out.println(arr[h]+" "+hun+" And "+arr1[tenp]+arr[up]);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==1000)
            System.out.println("One Thousand");
        else if(a<1000)
            threedigit(a);
        else
            System.out.println("Number is greater than 1000.");
    }

}
