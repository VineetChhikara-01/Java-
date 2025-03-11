import java.util.Random;
public class random {
    public static void main(String[] args) {
        int sum=0;
        Random rand = new Random();
        for(int i=0;i<100;i++){
            int randomno = rand.nextInt(1,1000);
            System.out.println("Random number :"+randomno);
            sum=sum+randomno;
        }
        System.out.println("Sum :"+sum);
        System.out.println("Average :"+(sum/100));
    }
}