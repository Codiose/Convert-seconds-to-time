package staticMethods;
import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		
		Scanner windu = new Scanner(System.in);
		
		int seconds, remainingSeconds, minutes, hours;
		
		System.out.println("Input the seconds...");
		seconds = windu.nextInt();
		
		minutes = seconds / 60;
		remainingSeconds = seconds % 60;
		
		if(minutes <= 60) {
			System.out.println(seconds + " s = " + minutes + " m : " + remainingSeconds + " s");
		}else {
			
			hours = minutes / 60;
			minutes = minutes % 60;
			remainingSeconds = seconds % 60;
			System.out.println(seconds + "s = " + hours + " h : " + minutes + " m : " + remainingSeconds + " s");
		}
	}
}
