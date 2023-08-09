package coreJava;

import java.util.Comparator;

import code.Employee;

public class AccountClass implements Comparator<Employee> {
	protected int aid;
	protected String aname;
	protected double abalance;

	public AccountClass() {

	}

	public AccountClass(int id, String name, double balance) {
		aid = id;
		aname = name;
		abalance = balance;
	}

	public void display() {
		System.out.println("Account Details");
		System.out.println(" ID=" + aid);
		System.out.println(" Name=" + aname);
		System.out.println(" Balance=" + abalance);
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public double getAbalance() {
		return abalance;
	}

	public void setAbalance(double abalance) {
		this.abalance = abalance;
	}

	public String toString() {
		return ("\nAccountID=" + aid + "\nAccount Name= " + aname + "\n Balance=" + abalance);
	}

	@Override
	public int compare(Employee obj1, Employee obj2) {

		return (obj1.getEid().CompareTo(obj2.getEid()));
	}

}
