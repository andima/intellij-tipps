package java;

import java.customer.Customer;
import java.customer.CustomerRepository;
import java.customer.CustomerRepositoryStub;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.lang.System.out;


/**
 * <b>Basics</b><p>
 * <p>Fix anything 				            Alt + Enter
 * <p>Next error, warning or suggestion 	F2
 * <p>Code Completion				        Ctrl + Shift + Enter
 * <p>Show Preview or Documentation		    Ctrl + Q
 * <p>Search Everywhere / Find in files	    Double Shift / Ctrl + Shift + F
 * <p>Comment / Block Comment			    Ctrl + /  or  Ctrl + Shift + /
 * <p>Refactor 				                Shift + Ctrl + Alt +T
 * <p><p><p>
 *
 * <b>Navigation</b><p>
 * <p>Focus Project Window			        Alt + 1
 * <p>Back on Editor				        ESC
 * <p>View recent files / locations	 	    Ctrl + E 	/    Ctrl + Shift +  E
 * <p>Go to declaration / implementation	Ctrl + B	/    Ctrl + Alt  + B
 * <p>Go to Line				            Ctrl + G
 * <p><p><p>
 *
 * <b>Misc</b><p>
 * <p>Show usage				            Ctrl + Alt + 7
 * <p>Find usages (View)				    Alt + F7
 * <p>Extend or shrink selection			Ctrl +W	/    Ctrl + Shift + W
 * <p>
 * <a href="https://www.jetbrains.com/help/idea/mastering-keyboard-shortcuts.html#learn-shortcuts">Top 15 Intellij</a>
 */
public class Top15Shortcuts {

    /**
     * Crtl + B on Class name, jump to class
     * Ctrl + Alt + B on Class name, jump to implementation
     */
    private final CustomerRepository repository = new CustomerRepositoryStub();

    private final String[] stringArray = new String[]{"a", "aa", "bbb", "bb", "cc", "ccc"};


    /**
     * "F2" jump to next Issue
     * "Alt + Enter" fix Issue
     */
    private void importAndError() {
//        List<String> myArray = new ArrayList<Integer>();
    }


    /**
     * "Alt + Enter" to simplifying code
     */
    public void lambdas() {
        // Remove redundant code (Function function)
        Function<Function, Function> f3 = (Function function) -> function.compose(function);

        // Lambda can be replaced with method reference  && static import
        Arrays.sort(stringArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

        // Replace with foreEach on foo
        ArrayList<String> foo = getStrings();
        for (String s : foo) {
            if (s != null) {
                out.println(s);
            }
        }

    }


    /**
     * @param name String
     * Goto Declaration with Ctrl+ B
     */
    public void saveCustomer(String name, int id){
        Customer customer= new Customer(name,id);
        repository.save(customer);

    }


    /**
     * single command with Ctrl + /
     * Block comment with Ctrl+ shift + /
     */
    public void commentLines() {
        // single command with Ctrl + /
        String s1 = "singe line string";

        /*this is a Block comment with Ctrl+ shift + / */
         String s2 = " This is a very long string" +
            "which is on many lines" +
            "to have a better formatting.";
    }


    /**
     * Complete Current Statement
     * Shift+ Ctrl + Enter
     * @return
     */
    private List<String> replaceWithCollect(){
         /*simply add the semi-colo  */
//        List<String> result = getStrings()

        // complete for or if statement and jump to next coding point

        return null;
    }


    /**
     * Refactor
     * Shift + Ctrl + Alt + T
     *
     * Duplicate
     * Ctrl + D
     *
     */
    public void refactor(){

        //Rename , Constant
        String number = "My name";

        //Create
        String[] steps = new String[5];
        steps[0] = "First select a block of code" + number;


    }


    private Customer getCustomerbyID(int Id){
       return repository.getById(Id);
    }

    /**
     * Show Usage   Ctrl + Alt + 7
     */
    private ArrayList<String> getStrings() {
        return (ArrayList<String>) Arrays.asList("name", "city", "age");
    }

    private ArrayList<String> getCopyOfString() {
        return getStrings();
    }
}
