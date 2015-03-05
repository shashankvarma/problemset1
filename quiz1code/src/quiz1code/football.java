package quiz1code;
import java.util.Scanner;
public class football {

	static Scanner user_input= new Scanner(System.in);

	public static void main(String[] args) {
	
		
		double Completions;
		double Attempts;
		double Yards;
		int Interceptions;
		int Touch_down;
		
		System.out.print("nbr of touchdowns scored?: ");
		Touch_down = user_input.nextInt();
		
		System.out.print("nbr of interseptions?: ");
		Interceptions = user_input.nextInt();
		
		System.out.print("nbr of yards covered? : ");
		Yards = user_input.nextDouble();
		
		System.out.print(" nbr of attepmts?: ");
		Attempts = user_input.nextInt();
		
		System.out.print("nbr of completions: ");
		Completions = user_input.nextInt();
				
		double x;
		x= (double) ((((Completions/Attempts) * 100) - 30) * 0.05);
		System.out.println(x);
		
		double y;
		y = (double) (((Yards/Attempts) - 3) * .25);
		System.out.println(y);
		
		double z;
		z = (double) (((Touch_down/Attempts) * 100) * 0.2);
		System.out.println(z);
		
		double u;
		u = (double) (2.375 - (((Interceptions/Attempts) * 100) * 0.25));
		System.out.println(u);
	
		double Overall_rating;
		
		Overall_rating = ((x + y + z + u) / 6) * 100;
		System.out.println(x+y+z+u);
		System.out.println((x + y + z + u) / 6);
		System.out.print("The overall quater back rating is :  " + (Overall_rating));
}
}
