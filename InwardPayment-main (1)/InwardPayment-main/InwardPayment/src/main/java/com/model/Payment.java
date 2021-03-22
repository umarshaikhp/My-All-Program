package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AcceptPayment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int payment_id;
	private String name;
	private long amount;
	private String account_type;
	private String date;
	private String recivedby;
	private String paymentmethod;

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRecivedby() {
		return recivedby;
	}

	public void setRecivedby(String recivedby) {
		this.recivedby = recivedby;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", name=" + name + ", amount=" + amount + ", account_type="
				+ account_type + ", date=" + date + ", recivedby=" + recivedby + ", paymentmethod=" + paymentmethod
				+ "]";
	}

}
