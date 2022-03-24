package coreJava;

public class Quiz {

	public static void main(String[] args) {
		try {
			throw 10;
		}
		catch(int e) {
			System.out.println("Got the Exceotion" +e);
		}
	}

}
