package objects;

public class ObjectWithPrimitiveArray {
    private int[] ints;

    public ObjectWithPrimitiveArray(int[] intArr) {
        ints = intArr;
    }

    public void setIntegerArray(int[] newInts) {
        ints = newInts;
    }

    public int[] getIntegerArray() {
        return ints;
    }
}
