package _scale.schemas.accounts;



public class test {

	public static void main(String[] args) {

		Accounts accounts = new Accounts();
		
		for (_scale.schemas.accounts.Accounts.Account account : accounts.getAccount()) {
			System.out.println("Result: " + account.getOrgName() + " " + account.getState());
		}
	}
}
