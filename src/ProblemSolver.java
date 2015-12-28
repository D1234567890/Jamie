public class ProblemSolver {
	int arg1;
	int arg2;
	char mathFunc;

	ProblemSolver() {

	}

	public double parseFunction(String s) {
		String first = "";
		char func = ' ';
		String second = "";
		boolean switchArg = false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '+' || c == '-' || c == '*' || c == '/') {
				func = c;
				switchArg = true;
			} else if (switchArg) {
				second += c;
			} else {
				first += c;
			}
		}
		if (func == '+') {
			double a = Double.parseDouble(first);
			double b = Double.parseDouble(second);
			return add(a, b);
		}
		if (func == '-') {
			double a = Double.parseDouble(first);
			double b = Double.parseDouble(second);
			return subtract(a, b);
		}
		if (func == '*') {
			double a = Double.parseDouble(first);
			double b = Double.parseDouble(second);
			return multiply(a, b);
		}
		if (func == '/') {
			double a = Double.parseDouble(first);
			double b = Double.parseDouble(second);
			return divide(a, b);
		}
		return 0.0;
	}

	double add(double num1, double num2) {
		return num1 + num2;
	}

	double subtract(double num1, double num2) {
		return num1 - num2;
	}

	double multiply(double num1, double num2) {
		return num1 * num2;
	}

	double divide(double num1, double num2) {
		if (num2 == 0) {
			return 0;
		} else {
			return num1 / num2;
		}
	}
}