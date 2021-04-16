import java.util.Scanner;

public class distance_cal {

	public static void main(String[] args) {
		int x1,x2,y1,y2;
		double dis;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 point value:");
		x1=sc.nextInt();
		System.out.println("Enter y1 point value:");
		y1=sc.nextInt();
		System.out.println("Enter x2 point value:");
		x2=sc.nextInt();
		System.out.println("Enter y2 point value:");
		y2=sc.nextInt();
		dis= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Length of line is:"+dis);

}
}
