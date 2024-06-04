package alex.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTestInJava {
    List<String> todos =Arrays.asList("Spring Boot","Azure","Devops"); 
	
	@Test
	void test() {
		boolean test = todos.contains("Azure");
		assertEquals(true, test);
		assertEquals(3,todos.size());
	}

}
