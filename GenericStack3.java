package generics;

import java.util.ArrayList;

public class GenericStack3<List> {
	
	private ArrayList <List> list = new ArrayList<>();

	public GenericStack3() {
		
	}
	
	public int getSize() {
		return list.size();
	}

	public List peek() {
		return list.get(getSize() - 1);
	}

	public void push(List o) {
		list.add(o);
	}

	public List pop() {
		List o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
