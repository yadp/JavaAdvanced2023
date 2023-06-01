package preparation.String;

public class MainString {

    public static void main(String[] args) {
        String text = new String("test");
        String test = new String("test");

        //What is wrong with this one?
        if (test==text){
            System.out.println("Strings are the same");
        } else {
            System.out.println("Something went wrong");
        }
        //Example of the correct way to compare two strings
        if (text.equals(test)){
            System.out.println("Strings are the same");
        } else {
            System.out.println("Something went wrong");
        }
    }
}
