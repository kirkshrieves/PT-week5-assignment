package week05;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void Error(String error) {
		System.out.println("****************" +  "\n***Error: " + error + "***" + "\n****************");
		
	}

}
