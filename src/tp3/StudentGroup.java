package tp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StudentGroup {
	HashSet<Student> set;
	String id;

	public StudentGroup(String id) {
		this.id = id;
		set = new HashSet<Student>();
	}

	public HashSet<Student> getSet() {
		return set;
	}

	public String getId() {
		return id;
	}
	public void addStudent(Student st) {
        set.add(st);
    }
    public void sort() {
        ArrayList<Student> studentList = new ArrayList<Student>(set);
        Collections.sort(studentList);
        System.out.println("Étudiants du groupe " + id + " triés par moyenne générale:");
        for (Student student : studentList) {
            System.out.println("ID: " + student.getId() + " - Moyenne: " + student.average());
        }     
    }
}
