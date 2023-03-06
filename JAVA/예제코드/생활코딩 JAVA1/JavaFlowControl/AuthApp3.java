
public class AuthApp3 {

	public static void main(String[] args) {

		String[][] users = { 
				{"egoing", "1111"},
				{"jinhyck", "2222"}, 
				{"youbin", "3333"}
		};
		
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String[] currentUser = users[i];
			if (currentUser[0].equals(inputId) && currentUser[1].equals(inputPass)) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi, ");
		if(isLogined) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
