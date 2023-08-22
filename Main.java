package pvl5;

public class Main {
    public static void main(String[] args) {
    
        Person grandpa = new Person("Johann");
        FamilyTree buddenbrooksTree = new FamilyTree(grandpa);
        System.out.println(buddenbrooksTree.getRoot()); // gibt 0 zurück
        System.out.println(buddenbrooksTree.insertAsChildForId(new Person("Gotthold"), 0)); // gibt 1 zurück
        System.out.println(buddenbrooksTree.insertAsChildForId(new Person("Jean"), 0)); // gibt 2 zurück
        System.out.println(buddenbrooksTree.insertAsChildForId(new Person("Olly"), 0)); // gibt 3 zurück
        System.out.println(buddenbrooksTree.insertAsChildForId(new Person("Friederike"), 1)); // gibt 4 zurück
        System.out.println(buddenbrooksTree.insertAsChildForId(new Person("Henriette"), 1)); // gibt 5 zurück
        System.out.println(buddenbrooksTree.insertAsChildForId(new Person("Pfiffi"), 1)); // gibt 6 zurück
        System.out.println(buddenbrooksTree.insertAsChildForId(new Person("Thomas"), 2)); // gibt 7 zurück
        System.out.println(buddenbrooksTree.insertAsChildForId(new Person("Antonie"), 2)); // gibt 8 zurück
        System.out.println(buddenbrooksTree.insertAsChildForId(new Person("Christian"), 2)); // gibt 9 zurück
        System.out.println(buddenbrooksTree.insertAsChildForId(new Person("Clara"), 2)); // gibt 10 zurück
        System.out.println(buddenbrooksTree.getParentOf(3)); // gibt 0 zurück
        System.out.println(buddenbrooksTree.getSiblingsOf(3)); // gibt [1, 2] zurück
        System.out.println(buddenbrooksTree.getChildrenOf(3)); // gibt eine leere Liste zurück
        System.out.println(buddenbrooksTree.getNiecesNephewsOf(3)); // gibt [4, 5, 6, 7, 8, 9, 10] zurück
    }
}

