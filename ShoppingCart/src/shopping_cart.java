import java.lang.String;
import java.util.ArrayList;
public class shopping_cart {

	int counter=0;
	int x=0;
	
	public int count() {
		
		return counter;
	}

	public void add(String string, int i) {
		// TODO Auto-generated method stub
		String s=string;
		x = x+i;
		counter++;
		
	}

	public int Total_Price() {
		// TODO Auto-generated method stub 
		return x;
	}
}