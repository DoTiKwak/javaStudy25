package ch05.mbcbank;

public class AccountDTO {

	private String ano; // 계좌번호
	private String owner; // 계좌주
	private int balance; // 잔액
	private String bankname; // 은행명

	public AccountDTO(String ano, String owner, int balance, String bankname) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.bankname = bankname;
	}

	public AccountDTO() {

	}

	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public String getBankname() {
		return bankname;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Override
	public String toString() {
		return "AccountDTO [ano=" + ano + ", owner=" + owner + ", balance=" + balance + ", bankname=" + bankname + "]";
	}

} // class 종료
