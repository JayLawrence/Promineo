import java.util.Random;

public class TestDemo {
	
	
	
	
	
	
	 Integer addPositive(int a, int b) {
		
		if(a > 0 && b > 0) {
			return Integer.valueOf(a+b);
		}
		else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
			
	}
	
	 int randomNumberSquared() {
		
		int random = getRandomInt();
		
		return random * random;
	
		
	}
	
	 int getRandomInt() {
		
		Random random = new Random();
		
		return (random.nextInt() % 10) +1;
	}

}
