package com.chapter17.streamApp;

import java.io.Serializable;

public class AccountRecordSerializable implements Serializable {

  private int account;
  private String firstName;
  private String lastName;
  private double balance;

  public AccountRecordSerializable() {
    this(0, "", "", 0.0);
  }

  public AccountRecordSerializable(int acct, String first, String last, double bal) {
    setAccount(acct);
    setFirstName(first);
    setLastName(last);
    setBalance(bal);
  }

  // setters:
  public void setAccount(int acct) {
    account = acct;
  }

  public void setFirstName(String first) {
    firstName = first;
  }

  public void setLastName(String last) {
    lastName = last;
  }

  public void setBalance(double bal) {
    balance = bal;
  }

  // Getters:
  public int getAccount() {
    return account;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public double getBalance() {
    return balance;
  }
}
