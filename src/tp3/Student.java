package tp3;

import java.util.ArrayList;
import java.util.HashMap;

public class Student implements Comparable<Student> {
	private String id;
	private Curriculum myCurriculum;
	private HashMap<String, ArrayList<Double>> resultats;

	public Student(String i, Curriculum c) {
		id = i;
		myCurriculum = c;
        resultats = new HashMap<String, ArrayList<Double>>();
    
	}



	public String toString() {

		return "Student [id=" + id + ", myCurriculum=" + myCurriculum

				+ ", resultats=" + resultats + "]";

	}

	public String getId() {
		return id;
	}

	public Curriculum getMyCurriculum() {
		return myCurriculum;
	}

	public boolean addNote(String s, Double d) {
		if (!myCurriculum.getModSet().contains(s)) {
			return false;
		}
		if (!resultats.containsKey(s)) {
			resultats.put(s, new ArrayList<Double>());
		}
		resultats.get(s).add(d);
		return true;
	}

	public double average(String s) {
		if (!resultats.containsKey(s) || resultats.get(s).isEmpty()) {
			return 0.0;
		}
		ArrayList<Double> notes = resultats.get(s);
		double sum = 0.0;

		for (Double note : notes) {
			sum += note;
		}

		return sum / notes.size();
	}

	 public Double average() {
	        double sumProduits = 0.0;
	        double sumCoefs = 0.0;
	        
	        for (String module : myCurriculum.getModSet()) {
	            int coef = myCurriculum.getCoefMod(module);
	            double moyModule = average(module);
	            
	            sumProduits += moyModule * coef;
	            sumCoefs += coef;
	        }
	        
	        if (sumCoefs == 0.0) {
	            return 0.0;
	        }
	        
	        return sumProduits / sumCoefs;
	    }
	    
	
	@Override
	public int compareTo(Student st) {
        return this.average().compareTo(st.average());
	
	}
}
