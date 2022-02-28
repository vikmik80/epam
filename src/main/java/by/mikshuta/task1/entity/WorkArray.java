package main.java.by.mikshuta.task1.entity;

public class WorkArray {
	public static void main(String[] args) {
	}
	private int[] array;	
	public WorkArray() {
	}
	public WorkArray(int... array) {
		this.array = array;
	}		
	public int[] getWorkArray() {
		return array;
	}	
	public void setWorkArray(int... array) {
		this.array=array;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int a : array) {
			str.append(a).append(" ");
		}
		return str.toString();
	}
	
}
