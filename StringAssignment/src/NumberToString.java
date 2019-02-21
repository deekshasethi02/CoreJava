
public class NumberToString {
double num;

public double getNum() {
	return num;
}

public void setNum(double num) {
	this.num = num;
}
public int numberOutputInString() {
	String str=Double.toString(num);
	int temp = str.indexOf('.');
	return temp;
	
			
}
}
