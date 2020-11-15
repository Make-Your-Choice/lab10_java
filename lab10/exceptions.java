//import java.until.*;
class exceptions extends Exception {
	private int type;
	exceptions(int a) {
		type = a;
	}
	public String toString() {
		if(type==1)
			return "Incorrect value\n";
		else
			return "Unexpected error\n";
	}
}