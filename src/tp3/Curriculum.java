package tp3;

import java.util.HashMap;
import java.util.HashSet;

public class Curriculum {
	private String id;
	private HashMap<String, Integer> Mod_Coef;

	public Curriculum(String s) {
		id = s;
		Mod_Coef = new HashMap<String, Integer>();
	}

	public String getId() {
		return id;
	}

	public HashMap<String, Integer> getMod_Coef() {
		return Mod_Coef;
	}

	public void addModCoef(String s, int i) {
		Mod_Coef.put(s, i);
	}

	public int getCoefMod(String s) {
		if (Mod_Coef.containsKey(s)) {
			return Mod_Coef.get(s);
		}
		return 0;
	}

	public HashSet<String> getModSet() {
		return new HashSet<String>(Mod_Coef.keySet());
	}

	public String toString() {
		return "Curriculum [id=" + id + ", modules=" + Mod_Coef + "]";
	}
}
