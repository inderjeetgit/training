package hellow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class hellotest {

	@Test
	void test() {
		helloworld hw=new helloworld();
		String actual="hello world";
		String result=hw.getmessage();
		assertEquals(actual,result);
	}

}
