package pvl5;

import java.util.List;

public interface I_Person {

    String getName();

    List<I_Person> getChildren();

    void addChild(I_Person child);

    int getId();

    void setId(int id);
}
