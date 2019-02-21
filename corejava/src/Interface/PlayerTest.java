package Interface;

import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerTest {

	public static void main(String[] args) {
	Player deeksha = new Player("deeksha",10,15);
	System.out.println(deeksha.toString());
		saveObject(deeksha);
		deeksha.setHitPoints(8);
		System.out.println(deeksha);
		deeksha.setWeapon("sword");
		saveObject(deeksha);
		loadObject(deeksha);
		System.out.println(deeksha);
		
	}
	
	public static ArrayList<String> readValues(){
		ArrayList<String> values = new ArrayList<String>();
		
		Scanner scanner= new Scanner(System.in);
		boolean quit = false;
		int index =0;
		
		System.out.println("choose\n" + "1 to enter string" + "0 to quit");
		
		while(!quit) {
			System.out.println("choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0 :
				quit = true;
				break;
			case 1 :
				System.out.println("enter a string");
				String stringInput = scanner.nextLine();
				values.add(index, stringInput);
				index++;
				break;
				
			}
			
			
		}
		return values;
		
	}
	public static void saveObject(ISavable objectToSave) {
		for(int i=0;i<objectToSave.write().size();i++) {
			System.out.println("saving" + objectToSave.write().get(i) + "to storage device");
			
		}
	}
	public static void loadObject(ISavable objectToLoad) {
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}
}
