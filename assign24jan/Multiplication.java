import java.util.*;
public class Multiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] result = new int[10];
	int number=sc.nextInt();
	for(int i=1;i<=result.length;i++){
		result[i-1]=number*i;
	}
        
        for(int i=1; i <=10 ;i++){
            System.out.println(number+ " * "+i + " = "+ result[i-1]);
        }

    }
}