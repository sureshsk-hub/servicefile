package com.vedika.functionhall.model;

public class AccountDetails {
	private String accountNumber;
	private String accountName;
	private String accountType;
	private String bank;
	private String branch;
	private String ifsc;
	private String panNumber;
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfsc() {
		return ifsc;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
				+ accountType + ", bank=" + bank + ", branch=" + branch + ", ifsc=" + ifsc + ", panNumber=" + panNumber
				+ "]";
	}

	
}
