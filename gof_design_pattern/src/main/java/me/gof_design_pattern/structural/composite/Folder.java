package me.gof_design_pattern.structural.composite;

import java.util.Iterator;
import java.util.LinkedList;

public class Folder extends Unit {
	private final LinkedList<Unit> unitList =
			new LinkedList<>();

	public Folder(String name) {
		super(name);
	}

	@Override
	public int getSize() {
		int size = 0;

		for (Unit it : unitList) {
			size += it.getSize();
		}

		return size;
	}

	public boolean add(Unit unit) {
		unitList.add(unit);
		return true;
	}

	public void list() {
		list("", this);
	}

	public void list(String indent, Unit unit) {
		if (unit instanceof File) {
			System.out.println(indent + unit);
		} else {
			Folder dir = (Folder) unit;
			Iterator<Unit> it = dir.unitList.iterator();
			System.out.println(indent + "+ " + unit);
			while (it.hasNext()) {
				list(indent + "    ", it.next());
			}
		}
	}

}
