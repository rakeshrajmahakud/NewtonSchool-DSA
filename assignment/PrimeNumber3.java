package assignment;

public class PrimeNumber3 {
    public static void main(String args[]){
        for(int i = 2; i<=100;){
            int prime = 1;
            for(int loop = 2; loop <=i; loop++) {
                if((i % loop) == 0 && loop!=i) {
                    prime = 0;
                }
            }
            if (prime != 0){
                System.out.println(i+" is a prime number");
                i++;
            }
            else
                i++;
        }
    }
}
