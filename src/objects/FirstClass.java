package objects;

//circular reference to SecondClass
public class FirstClass {
    private SecondClass secondClass;
    private int intVar;

    public FirstClass() {
        secondClass = new SecondClass();
    }

    public FirstClass(int newInt) {
        secondClass = new SecondClass();
        intVar = newInt;
    }

    public void setIntVar(int newInt) {
        intVar = newInt;
    }

    public int getIntVar() {
        return intVar;
    }

    public void setSecondClass(SecondClass newSecondClass) {
        secondClass = newSecondClass;
    }

    public SecondClass getSecondClass() {
        return secondClass;
    }
}
