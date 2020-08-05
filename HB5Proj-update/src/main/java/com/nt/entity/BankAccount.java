package com.nt.entity;

public class BankAccount {
private Long Accno;
private String AccHolderName;
private Float Amount;
public Long getAccno() {
	return Accno;
}
public void setAccno(Long accno) {
	Accno = accno;
}
public String getAccHolderName() {
	return AccHolderName;
}
public void setAccHolderName(String accHolderName) {
	AccHolderName = accHolderName;
}
public Float getAmount() {
	return Amount;
}
public void setAmount(Float amount) {
	Amount = amount;
}

}
