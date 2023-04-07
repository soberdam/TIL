package ch03;

public class PasswordTest {
	private String password;
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) throws PasswordException {
		
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if (password.length()<5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		} else if (password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		
		this.password = password;
	}


	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		
		String pwd = null;
		try {
			test.setPassword(pwd);
			System.out.println("no error1");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		pwd = "abcd";
		try {
			test.setPassword(pwd);
			System.out.println("no error2");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		pwd = "abcde";
		try {
			test.setPassword(pwd);
			System.out.println("no error3");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		pwd = "abcd12!@";
		try {
			test.setPassword(pwd);
			System.out.println("no error4");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
