import java.util.ArrayList;

public class Utility {
	
	public static ArrayList<Table> createDailyTables (ArrayList<Table> allTables, ArrayList<String> dailySlots) {	
		ArrayList<Table> dailyTables = new ArrayList<Table>();
		for (int i = 0; i < dailySlots.size(); i++) {
			for (int j = 0; j < allTables.size(); j++) {
				Table temp = allTables.get(j);
				temp.setTimeSlot(dailySlots.get(i));
				dailyTables.add(temp);
			}
		}
		return dailyTables;
	}

	public void otherTestClass() {
		;
	}

	public void secondTestClass() {
		;
	}
	
	

}
