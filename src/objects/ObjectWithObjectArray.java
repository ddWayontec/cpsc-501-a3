package objects;

public class ObjectWithObjectArray {
    ObjectWithPrimitives[] objectWithPrimitivesArr;

    public ObjectWithObjectArray(ObjectWithPrimitives[] arr) {
        objectWithPrimitivesArr = arr;
    }

    public void setObjectWithPrimitivesArr(ObjectWithPrimitives[] arr) {
        objectWithPrimitivesArr = arr;
    }

    public ObjectWithPrimitives[] getObjectWithPrimitivesArr() {
        return objectWithPrimitivesArr;
    }
}
