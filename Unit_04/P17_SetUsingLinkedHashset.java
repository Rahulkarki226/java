package Unit_04;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * {set}
 * No Duplicates 
 * at most one null element
 *
 *{hash_Set}
 * Inside, It uses doubly-linked list internally
 * Preserve insertion order
 * 
 * */


public class P17_SetUsingLinkedHashset {
	public static void main(String arg[]) {
		Set<String>hash_Set = new LinkedHashSet<String>();
		hash_Set.add("karki");
		hash_Set.add("rahul");
		hash_Set.add("into");
		hash_Set.add("world");
		hash_Set.add("god");
		hash_Set.add("power");
		hash_Set.add(null);
		hash_Set.add(null);
		
		hash_Set.remove(null);
		System.out.println(hash_Set);
	}
}
