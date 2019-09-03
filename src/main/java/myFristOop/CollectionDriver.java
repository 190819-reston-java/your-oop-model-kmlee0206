package myFristOop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDriver {

	public static void main(String[] args) {
		
		phoneCollection();
		

	}

	private static void phoneCollection() {
		List<Android> androidList = new ArrayList<Android>();
		List<Ios> iosList = new ArrayList<Ios>();
		
		androidList.add(new Android());
		androidList.add(new Android("Samsung"));
		androidList.add(new Android("Motorola", "G6"));
		androidList.add(new Android("Google", "Pixel2", false));
		
		iosList.add(new Ios());
		iosList.add(new Ios("Apple"));
		iosList.add(new Ios("Apple", "iPhone8"));
		iosList.add(new Ios("Apple", "Xr", true));
		
		System.out.println("REGULAR:");   //for my own learning
		System.out.println(androidList);
		System.out.println(iosList);
		System.out.println("------------------------------");
		
		Set<Android> androidSet = new HashSet<Android>(androidList);
		Set<Ios> iosSet = new HashSet<Ios>(iosList);
		
		System.out.println("HashSet:");  // Hashset
		System.out.println(androidSet);
		System.out.println(iosSet);
		System.out.println("------------------------------");
		
		
	}

}
