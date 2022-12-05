package week05;

public class App {

	public static void main(String[] args) {
		Logger AsteriskLogger = new AsteriskLogger();
		AsteriskLogger.Log("Mercedes");
		System.out.println();
		AsteriskLogger.Error("P0420: catalytic converter efficiency bellow threshold");
		System.out.println();
		
		
		Logger SpacedLogger = new SpacedLogger();
		SpacedLogger.Log("WDDHH8JB9GB339306");
		System.out.println();
		SpacedLogger.Error("S212 VIN incorrect");
		

	}

}
