package tp3;

public class Main {
    public static void main(String[] args) {
        Curriculum informatique = new Curriculum("Dsi23");
        informatique.addModCoef("POO", 3);
        informatique.addModCoef("SYMFONY", 2);
        informatique.addModCoef("JAVAEE", 4);
        informatique.addModCoef("FRANCAIS", 1);
        
        
        Curriculum Technologie = new Curriculum("TI13");
        Technologie.addModCoef("C", 4);
        Technologie.addModCoef("WEBDEV", 3);
        Technologie.addModCoef("MATH", 2);
        
        
        System.out.println("=== section disponibles ===");
        System.out.println(informatique);
        System.out.println(Technologie);
        System.out.println();
        Student etudiant1 = new Student("houssem", informatique);
        Student etudiant2 = new Student("eya", informatique);
        Student etudiant3 = new Student("3ez din", Technologie);
        
        System.out.println("=== Ajout des notes ===");
        etudiant1.addNote("POO", 13.0);
        etudiant1.addNote("POO", 20.0);
        etudiant1.addNote("POO", 16.0);
        etudiant1.addNote("JAVAEE", 17.0);
        etudiant1.addNote("SYMFONY", 17.0);
        etudiant1.addNote("JAVAEE", 19.0);
        etudiant1.addNote("FRANCAIS", 15.0);
        
        etudiant2.addNote("POO", 12.0);
        etudiant2.addNote("POO", 11.0);
        etudiant2.addNote("JAVAEE", 14.0);
        etudiant2.addNote("SYMFONY", 17.0);
        etudiant2.addNote("FRANCAIS", 18.0);
        
        etudiant3.addNote("C", 15.0);
        etudiant3.addNote("WEBDEV", 16.0);
        etudiant3.addNote("MATH", 14.0);
        
        System.out.println("\n=== Moyennes par module ===");
        System.out.println("Etudiant " + etudiant1.getId() + ":");
        System.out.println("POO: " + etudiant1.average("POO"));
        System.out.println("SYMFONY: " + etudiant1.average("SYMFONY"));
        
        System.out.println("\nEtudiant " + etudiant2.getId() + ":");
        System.out.println("POO: " + etudiant2.average("POOA"));
        System.out.println("SYMFONY: " + etudiant2.average("DEVWEB"));
        System.out.println("JAVAEE: " + etudiant2.average("MATH"));
        System.out.println("FRANCAIS: " + etudiant2.average("FRANCAIS"));
        
        
        System.out.println("\n=== Moyennes générales ===");
        System.out.println("Etudiant " + etudiant1.getId() + ": " + etudiant1.average());
        System.out.println("Etudiant " + etudiant2.getId() + ": " + etudiant2.average());
        System.out.println("Etudiant " + etudiant3.getId() + ": " + etudiant3.average());
        System.out.println("\n=== Groupes d'étudiants ===");
        StudentGroup groupeDsi = new StudentGroup("Groupe-INFO");
        groupeDsi.addStudent(etudiant1);
        groupeDsi.addStudent(etudiant2);
        StudentGroup groupeTi = new StudentGroup("Groupe-TI");
        groupeTi.addStudent(etudiant3);
        System.out.println("\n=== Tri des étudiants par moyenne ===");
        groupeDsi.sort();
        System.out.println();
        groupeTi.sort();
        System.out.println("\n=== Comparaison d'étudiants ===");
        if (etudiant1.compareTo(etudiant2) > 0) {
            System.out.println("L'étudiant " + etudiant1.getId() + " a une meilleure moyenne que l'étudiant " + etudiant2.getId());
        } else if (etudiant1.compareTo(etudiant2) < 0) {
            System.out.println("L'étudiant " + etudiant2.getId() + " a une meilleure moyenne que l'étudiant " + etudiant1.getId());
        } else {
            System.out.println("Les étudiants " + etudiant1.getId() + " et " + etudiant2.getId() + " ont la même moyenne");
        }

}
}
