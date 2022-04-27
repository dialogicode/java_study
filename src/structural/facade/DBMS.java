package structural.facade;

import java.util.HashMap;

public class DBMS {
	private final HashMap<String, Row> db = new HashMap<>();

	public DBMS() {
		db.put("jane", new Row("Jane", "1990-02-14", "jane09@email.com"));
		db.put("robert", new Row("Robert", "1979-11-05", "nice@email.com"));
		db.put("dorosh", new Row("Dorosh", "1985-08-21", "dorosh@email.com"));
	}

	public Row query(String name) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return db.get(name.toLowerCase());
	}
}
