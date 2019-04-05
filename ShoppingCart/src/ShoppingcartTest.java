import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
	@Test
	public void empty_shopping() throws Exception {
		shopping_cart carty=new shopping_cart();
		assertTrue(carty.count()==0);
		
	}
	@Test
	public void add_Book() throws Exception {
		shopping_cart carty=new shopping_cart();
		carty.add("Java Book",127);
		
		assertTrue(carty.count()==1);
		assertTrue(carty.Total_Price()==127);

	}
	@Test
	public void add_Books() throws Exception {
		shopping_cart carty=new shopping_cart();
		carty.add("Java Book",127);
		carty.add("Web design book ", 100);
		assertTrue(carty.count()==2);
		assertTrue(carty.Total_Price()==227);

		
	}

	
}
