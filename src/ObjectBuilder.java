import objects.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ObjectBuilder {
    Scanner scanner;

    public Object createObject() {

        scanner = new Scanner(System.in);
        printMenu();
        String s = scanner.nextLine();
        switch (s) {
            case "1":
                return createPrimitiveObject();
            case "2":
                return createReferenceObject();
            case "3":
                return createPrimitiveArrayObject();
            case "4":
                return createReferenceArrayObject();
            case "5":
                return createCollectionObject();
        }
        System.out.println("Error: input not recognized");
        return null;
    }

    private Object createCollectionObject() {
        System.out.println("Creating object with collection...");
        return new ObjectWithCollection();
    }

    private Object createReferenceArrayObject() {
        ObjectWithPrimitives[] objectArr;

        System.out.println("Enter size of Array:");
        int arrSize = scanner.nextInt();

        objectArr = new ObjectWithPrimitives[arrSize];
        for (int i = 0; i < objectArr.length; i++) {
            objectArr[i] = new ObjectWithPrimitives();
        }
        return new ObjectWithObjectArray(objectArr);
    }

    private Object createPrimitiveArrayObject() {
        int[] intArr;

        System.out.println("Enter size of desired array:");
        int arrSize = scanner.nextInt();

        intArr = new int[arrSize];
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Enter int value at index:" + i);
            int indexVal = scanner.nextInt();
            intArr[i] = indexVal;
        }
        return new ObjectWithPrimitiveArray(intArr);
    }

    private Object createReferenceObject() {
        System.out.println("Enter int value for reference object:");
        int val = scanner.nextInt();
        FirstClass firstClass = new FirstClass(val);
        return new SecondClass(firstClass);
    }

    public ObjectWithPrimitives createPrimitiveObject() {
        System.out.println("Enter string value:");
        String string = scanner.next();

        System.out.println("Enter integer value:");
        int intt = scanner.nextInt();

        return new ObjectWithPrimitives(string, intt);
    }


    public void printMenu() {
        System.out.println("Please enter the number associated with your desired action:\n" +
                "1 - Create object with primitives\n" +
                "2 - Create object with references\n" +
                "3 - Create object with primitive array\n" +
                "4 - Create object with array of references\n" +
                "5 - Create object with collection of references\n");
    }
}
