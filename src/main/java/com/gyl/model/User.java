/**
 * 
 */
package com.gyl.model;

/**
 * @Decription
 * @author gyl  Email:1076030424@qq.com
 * @version 1.0
 * @date 2020年2月7日下午8:33:39
 *
 */
public class User {
	private int id;
	private int userName;
	private double balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserName() {
		return userName;
	}

	public void setUserName(int userName) {
		this.userName = userName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", balance=" + balance + "]";
	}

}
