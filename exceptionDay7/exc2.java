package exceptionDay7;

public class exc2 {

	static void validateAge(int age) {

		if (age < 18)
			throw new ArithmeticException("you are fucking kid ");

	}

	public static void main(String[] args) {

		try {
			exc2.validateAge(12);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();

		} finally {
			System.out.println("you are fucking kid but you can drink ");
		}
	}

}
