package Day16;
import java.util.Scanner;

public class PrimeNoRange {
	public void primeNumber(int first , int second) {
        int m , j , flag;

        for(m=first;m<=second;m++) {
            if(m==0 || m==1)
                continue;
            flag = 1;

            for(j=2;j<=m/2;++j) {
                if(m%j == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
                System.out.print(m+" ");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lower Bound: ");
        int first = scan.nextInt();

        System.out.print("Upper Bound: ");
        int second = scan.nextInt();

        PrimeNoRange prime = new  PrimeNoRange();
        System.out.println("--------------");
        prime.primeNumber(first,second);
        
    }
}
