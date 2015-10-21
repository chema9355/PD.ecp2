package web.presentation.models;

import java.util.HashMap;
import java.util.Map;

public class Model {

	private Map<String, Object> map = new HashMap<>();

	public void put(String key, Object value) {
		map.put(key, value);
	}

	public Object get(String key) {
		return map.get(key);
	}

	public void writeThemes() {
		System.out.print("\n" + "Temas [");
		if (map.containsKey("temas")) {
			System.out.print(map.get("temas"));
		}
		System.out.print("]" + "\n" + "---");
	}
}
