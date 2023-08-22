package pvl5;

import java.util.List;

public interface I_FamilyTree {
    Integer getRoot();

    Integer insertAsChildForId(Person person, Integer parent);
    Integer getParentOf(Integer id);

    List<Integer> getSiblingsOf(Integer id);
    List<Integer> getChildrenOf(Integer id);
    List<Integer> getNiecesNephewsOf(Integer id);
    List<Integer> getCousinsOf(Integer id);

    Person getPersonById(Integer id);

}
