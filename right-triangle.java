import java.util.Scanner;

public class right_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int k;
		int j;
		int rows=8;
		i=1;
		for(i=1;i<=8;i++){
			System.out.println("");
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}}
		for(i=1;i<=8;i++){
			System.out.println("");
		for(j=8;j>=i;j--) {
			System.out.print("*");
		}}
		
	}
}
