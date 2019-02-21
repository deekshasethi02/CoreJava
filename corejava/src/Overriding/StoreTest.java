package Overriding;

import javax.swing.JOptionPane;

public class StoreTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	String className = JOptionPane.showInputDialog("Enter class name");
	Class c = Class.forName("Overriding."+className);
	StoreGrandFather store = (StoreGrandFather)c.newInstance();
	store.storeManagement();
	store.storeAccount();
	store.manageTransport();
		
			
	}

}
