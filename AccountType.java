package assignment;

public enum AccountType {
	STANDARD(0) ,BUDGET(1),PREMIUM(2),SUPER_PREMIUM(3);
	int id;
	
	private AccountType(int id) {
		this.id = id;
		
	}
	int getQualityType() {
		return this.id;
	}
}
