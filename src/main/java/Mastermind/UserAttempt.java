package mastermind;

public class UserAttempt {
	private Result result;
	private int [] userInput;
	private int versuchNummer;
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public int[] getEingabe() {
		return userInput;
	}
	public void setEingabe(int[] eingabe) {
		this.userInput = eingabe;
	}
	public int getVersuchNummer() {
		return versuchNummer;
	}
	public void setVersuchNummer(int versuchNummer) {
		this.versuchNummer = versuchNummer;
	}

}
