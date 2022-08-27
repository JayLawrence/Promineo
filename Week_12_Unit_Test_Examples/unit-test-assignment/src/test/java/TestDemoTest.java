
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class TestDemoTest {

	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("TestDemoTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddecCorrectly(int a, int b, Integer expected, Boolean expectException) {

		if (!expectException) {
			assertThat(testDemo.addPositive(a,b) == (expected));
		}
		else {
			assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);    
		}

	}
	
	static Stream<Arguments> argumentsForAddPositive() {
		
		
		return Stream.of( arguments(2, 4, 6, false), arguments(10, 15, 25, false), arguments(0,0,1, true), arguments (-3, 4, 0, true), arguments (-5, -10, -15, true));
		
	}
	
	
	@Test
	void assertThatNumberSquaredIsCorrect(){
		TestDemo mockDemo = spy(testDemo);
		
		doReturn(5).when(mockDemo).getRandomInt();
		
		int fiveSquared = mockDemo.randomNumberSquared();
		
		assertThat(fiveSquared == 25);
		
		
	}
	
	

}
