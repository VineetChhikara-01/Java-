import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the synsets for the month of April :");
        int april =sc.nextInt();
        System.out.print("Enter the synsets for the month of May :");
        int may =sc.nextInt();
        System.out.print("Enter the synsets for the month of June :");
        int june =sc.nextInt();
        int result = (april+may+june)/3;
        System.out.print("Average Synset Entered :"+result);
        sc.close();
    }
}
