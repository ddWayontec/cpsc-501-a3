package objects;

//circular reference to FirstClass
public class SecondClass {
    private FirstClass firstClass;

    public SecondClass(FirstClass firClass) {
        firstClass = firClass;
    }

    public SecondClass() {}

    public void setFirstClass(FirstClass newFirstClass) {
        firstClass = newFirstClass;
    }

    public FirstClass getFirstClass() {
        return firstClass;
    }
}
