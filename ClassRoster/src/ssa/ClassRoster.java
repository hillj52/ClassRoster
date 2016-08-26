package ssa;

import java.util.ArrayList;
import java.util.Collections;

public class ClassRoster {

	private ArrayList<String> roster;
	
	public String toString() {
		String sb = "";
		for (String name:roster) {
			sb += name + "\n";
		}
		sb += "Total number of students is " + roster.size() + ".\n";
		return sb;
	}
	
	public void ClassRosterReport() {
		System.out.println(this);
		Collections.reverse(roster);
		System.out.println(this);
	}
	
	public ClassRoster() {
		roster = new ArrayList<String>();
		roster.add("Jarret");
		roster.add("Karen");
		roster.add("Shaquil");
		roster.add("Aisha");
		roster.add("Daniel");
		roster.add("Joseph");
		roster.add("Li");
		roster.add("Stephen");
		roster.add("Stephen");
		roster.add("Peter");
		roster.add("Reuben");
		roster.add("Dax");
		roster.add("Arun");
		roster.add("Michael");
		roster.add("Joshua");
		roster.add("Gabriel");
		roster.add("Jonathon");
		roster.add("Kyle");
		roster.add("Evan");
		roster.add("Kevin");
		roster.add("Michael");
		roster.sort(null);
	}
}
