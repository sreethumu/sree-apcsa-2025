package warmup;

public class Main {

    public static void main(String[] args) {
        //Sum of all numbers below 1000 that are multiples of 3 or 5
        int sum=0;
        for(int i=0; i<1000; i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }
        System.out.println();
        System.out.println("Answer to problem 1: " + sum);

        //Sum of even fibonacci numbers
        int sum2 = 0;
        int[] fibonacci = new int[100];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for(int i=2; i<fibonacci.length; i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            int num = fibonacci[i];
            if(num>4000000){
                break;
            }
            if(num%2==0){
                sum2+=num;
            }
            
        }
        System.out.println("Answer to problem 3: "+sum2);

    }
}
