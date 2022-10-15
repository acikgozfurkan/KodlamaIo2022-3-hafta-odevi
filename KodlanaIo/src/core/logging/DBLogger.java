package core.logging;

public class DBLogger implements Logger {
	public void log(String data) {
		System.out.println("Veritabanına loglandı : " + data);
	}
}
