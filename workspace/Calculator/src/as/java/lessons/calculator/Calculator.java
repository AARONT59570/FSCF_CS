package as.java.lessons.calculator;

public class Calculator {
	String[] eqSplit;
	String eq;
	float numOne;
	float numTwo;
	float result;
	boolean add;
	boolean sub;
	boolean mul;
	boolean div;
	public void MakeEquation() {
		eqSplit = eq.split(" ", 3);
		if (eqSplit[1].equals("+")) {
			this.add = true;
		}
		else if (eqSplit[1].equals("-")) {
			this.sub = true;
		}
		else if (eqSplit[1].equals("*") || eqSplit[1].toLowerCase().equals("x")) {
			this.mul = true;
		}
		else if (eqSplit[1].equals("/")) {
			this.div = true;
		}
		numOne = Float.parseFloat(eqSplit[0]);
		numTwo = Float.parseFloat(eqSplit[2]);
	}
	public float Calculate(){
		if (add) {
			result = numOne + numTwo;
		}
		if (sub) {
			result = numOne - numTwo;
		}
		if (mul) {
			result = numOne * numTwo;
		}
		if (div) {
			result = numOne / numTwo;
		}
		return result;
	}
	public Calculator(String sum){
		this.eq = sum;
	}
}
