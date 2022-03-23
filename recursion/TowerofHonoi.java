package recursion;

public class TowerofHonoi {
    public static void main(String[] args) {
        towerofhonoi(3,"s","h","d");
    }
    public static void towerofhonoi(int n,String a ,String b,String c){
        if(n==1){
            System.out.println("move 1st disk from "+ a+ " to " + c);
            return;
        }
        towerofhonoi(n-1,a,c,b);
        System.out.println("move disk "+ n +" from "+ a+ " to "+c);
        towerofhonoi(n-1,b,a,c);

    }
}