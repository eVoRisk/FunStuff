import java.util.logging.*;

public class Logging {
	public static Logger l = Logger.getLogger("Logging");

	public void demo() {
		l.log(Level.SEVERE, "Shows severe level of the Logger");
	}

	public static void main(String[] args) {
		Logging d = new Logging();
		d.demo();
	}
}