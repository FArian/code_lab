package examples;

import java.time.Duration;
import java.time.Instant;

public class InstantDuration {

	public static void main(String[] args) {
		Instant fist= Instant.now();
		// Wait some time while somthing happends 
		{
		System.out.println("Wait some time while somthing happends");
		}
		Instant second= Instant.now();
		Duration duration= Duration.between(fist, second);
		
		System.out.printf("Duration between First-Instant: [%s] and Second-Instant [%s] is (%s)", fist,second,duration);

	}

}
