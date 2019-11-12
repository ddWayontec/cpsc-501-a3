package objects;

public class ObjectWithPrimitives {
    private String stringVar;
    private int intVar;

    public ObjectWithPrimitives() {}

    public ObjectWithPrimitives(int intVar) {
        this.intVar = intVar;
    }

    public ObjectWithPrimitives(String stringVar) {
        this.stringVar = stringVar;
    }

    public ObjectWithPrimitives(String stringVar, int intVar) {
        this.stringVar = stringVar;
        this.intVar = intVar;
    }

    public void setString(String newString) {
        stringVar = newString;
    }

    public void setInt(int newInt) {
        intVar = newInt;
    }

    public String getString() {
        return stringVar;
    }

    public int getInt() {
        return intVar;
    }
}
