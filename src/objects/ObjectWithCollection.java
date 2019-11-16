package objects;

import java.util.ArrayList;

public class ObjectWithCollection {
    private ArrayList arrayList;

    public ObjectWithCollection() {
        arrayList = new ArrayList();
        arrayList.add(new ObjectWithPrimitives());
        arrayList.add(new ObjectWithPrimitives());
    }

    public void setArrayList(ArrayList newArrayList) {
        arrayList = newArrayList;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

}
