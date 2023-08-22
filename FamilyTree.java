package pvl5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FamilyTree implements I_FamilyTree {

    private Map<Integer, Person> tree;
    private int nextId;
    private int rootId;

    public FamilyTree(Person root) {
        tree = new HashMap<>();
        tree.put(0, root);
        root.setId(0);
        nextId = 1;
        rootId = 0;
    }

    public Integer getRoot() {
        return rootId;
    }

    public Integer insertAsChildForId(Person person, Integer parent) {
        int id = nextId;
        person.setId(id);
        tree.put(id, person);
        Person family = tree.get(parent);
        family.addChild(person);
        nextId++;
        return id;
    }

    public Integer getParentOf(Integer id) {
        for (Person person : tree.values()) {
            for (I_Person child : person.getChildren()) {
                if (child.getId() == id.intValue()) {
                    return person.getId();
                }
            }
        }
        return null;
    }

    public List<Integer> getSiblingsOf(Integer id) {
        List<Integer> siblings = new ArrayList<>();
        Integer parentId = getParentOf(id);
        if (parentId != null) {
            Person parent = tree.get(parentId);
            for (I_Person child : parent.getChildren()) {
                if (child.getId() != id.intValue()) {
                    siblings.add(child.getId());
                }
            }
        }
        return siblings;
    }

    public List<Integer> getChildrenOf(Integer id) {
        List<Integer> children = new ArrayList<>();
        Person person = tree.get(id);
        for (I_Person child : person.getChildren()) {
            children.add(child.getId());
        }
        return children;
    }

    public List<Integer> getNiecesNephewsOf(Integer id) {
        List<Integer> niecesNephews = new ArrayList<>();
        List<Integer> siblings = getSiblingsOf(id);
        for (Integer siblingId : siblings) {
            niecesNephews.addAll(getChildrenOf(siblingId));
        }
        return niecesNephews;
    }

    public List<Integer> getCousinsOf(Integer id) {
        List<Integer> cousins = new ArrayList<>();
        Integer parentId = getParentOf(id);
        if (parentId != null) {
            List<Integer> siblings = getSiblingsOf(parentId);
            for (Integer siblingId : siblings) {
                cousins.addAll(getChildrenOf(siblingId));
            }
        }
        return cousins;
    }

    public Person getPersonById(Integer id) {
        return tree.get(id);
    }

}
