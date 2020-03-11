package examples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.function.Supplier;

public class Java8Supplier {
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<LocalDateTime> s = ()-> LocalDateTime.now();
		LocalDateTime timeAsLocalDateTime= s.get();
		System.out.println("TIME Type as LocalDateTime:");
		System.out.println(timeAsLocalDateTime);
		System.out.println("----------------------------");
		Supplier<String> s1= () ->dtf.format(LocalDateTime.now());
		String timeStr = s1.get();
		System.out.println("TIME Type as String");
		System.out.println(timeStr);

	}

}
