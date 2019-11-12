package objects;

//circular reference to FirstClass
public class SecondClass {
    private FirstClass firstClass;
    private int intVar;

    public SecondClass() {
        firstClass = new FirstClass();
    }

    public SecondClass(int newInt) {
        firstClass = new FirstClass();
        intVar = newInt;
    }

    public void setIntVar(int newInt) {
        intVar = newInt;
    }

    public int getIntVar() {
        return intVar;
    }

    public void setFirstClass(FirstClass newFirstClass) {
        firstClass = newFirstClass;
    }

    public FirstClass getFirstClass() {
        return firstClass;
    }
}
