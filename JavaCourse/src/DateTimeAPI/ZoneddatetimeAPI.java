package DateTimeAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneddatetimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter dat1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String str = dt.format(dat1);
		System.out.println(str);

	}

}
