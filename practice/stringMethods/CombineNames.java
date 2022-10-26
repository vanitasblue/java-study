package practice.stringMethods;

public class CombineNames {
    public static void main(String[] args) {
        String firstName = "Strawberry ";
        String lastName = "Oolong Tea";

        System.out.println(firstName.concat(lastName));

        // String is immutable object.
        // String methods, like concat() do not actually change a String object.
        String str1 = new String("Strawberry");
        str1 = str1.concat(" Oolong Tea");
        System.out.println(str1);

        String str2 = "Strawberry";
        str2.concat(" Oolong Tea");
        System.out.println(str2);
    }
}
