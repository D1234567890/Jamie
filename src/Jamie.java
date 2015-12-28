import java.io.IOException;
import javax.swing.JOptionPane;

public class Jamie {
	static ProblemSolver p = new ProblemSolver();
	static int numberOfTimes = 0;

	public static void main(String[] args) {
		boolean qq = true;
		while (qq) {
			if (numberOfTimes == 0) {
				speak("Hello!  Do you require assistance?");
			}
			if (numberOfTimes == 1) {
				speak("Do you want me to do another problem?");
			}
			if (numberOfTimes == 2) {
				speak("More problems for me to calculate in my CPU?");
			}
			if (numberOfTimes == 3) {
				speak("Are there anymore problems waiting to be solved?");
			}
			if (numberOfTimes == 4) {
				speak("do you want me to do a problem?");
			}
			if (numberOfTimes == 5) {
				speak("Require problems to be calculated in my CPU?");
			}
			if (numberOfTimes == 6) {
				speak("Have any problems waiting to be solved?");
			}
			String a = JOptionPane.showInputDialog("");
			while (!a.equalsIgnoreCase("no") && !a.equals("yes") && !a.equalsIgnoreCase("of course")
					&& !a.equalsIgnoreCase("sure") && !a.equalsIgnoreCase("obviously")
					&& !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you")) {
				speak("Please say your answer so that I can comprehend!");
				a = JOptionPane.showInputDialog("");
			}
			if (a.equals("how are you") || a.equals("how are you?")) {
				speak("good!");
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("WARNING! Could not make system sleep!");
				}
			}
			if (a.equalsIgnoreCase("yes")) {
				qq = false;
				speak("What is the math problem?");
				String problem = JOptionPane.showInputDialog("Math Problem:");
				String answer = "" + p.parseFunction(problem);
				speak(answer);
				if (numberOfTimes < 3) {
					numberOfTimes++;
				} else {
					numberOfTimes = 1;
				}
				try {
					Thread.sleep(6000);
				} catch (Exception e) {
					System.out.println("WARNING! Cannot make system sleep!");
				}
				qq = true;
			} else if (a.equalsIgnoreCase("no")) {
				speak("OK!  Bye!");
				qq = false;
			}
		}

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}