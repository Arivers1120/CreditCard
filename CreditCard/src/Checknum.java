


	

	public class Checknum {
		static int sum_2 = 0;
		static String valid = " is Valid";
		
		static String integer;
		static int sum_1 = 0;
		
		static String notValid = " is not Valid";
		static int total = 0;
		
		public static int evens(String integer) {
			for (int i = integer.length() - 2; i >= 0; i -= 2) {
				int firstNumber = 2 * Character.getNumericValue(integer.charAt(i));
				String toString = Integer.toString(firstNumber);
				for (int j = 0; j < toString.length(); j++) {
					int nums = Character.getNumericValue(toString.charAt(j));
					sum_1 += nums;
					}
			}
			total += sum_1;
			return sum_1;}
		
		public static int odd(String integer) {
			for (int p = integer.length() - 1; p >= 0; p -= 2) {
				sum_2 += Character.getNumericValue(integer.charAt(p));
				}
			total += sum_2;
		return sum_2;
		}
		
		public static int AddBoth() {
			return total;
		
		}
		public static boolean Verification() {
			
			if (total % 10 == 1) {
				System.out.println("Credit Card Number" + integer + notValid);
				return false;
			
			}
			
			else {
				
				System.out.println("Credit Card #" + integer + valid);
				return true;
			}
			
		}
		
	}

