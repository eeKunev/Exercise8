package Exercise8;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		       Compare randomStudents = new Compare();
		        System.out.println("Изберете възходящо (1) или низходящо (2) сортиране"); 
		        Scanner Sort = new Scanner(System.in);
		        int number = Sort.nextInt();
		        if (number == 1){
		            Compare.sortingWithLambdastwo();
		        }
		        if (number == 2){
		            Compare.sortingWithLambdas();
		        }
		    }
	}

