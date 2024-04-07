//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //non-primitive data types:

        //In Java, non-primitive data types are also known as reference types.
        //array
        //string //Java ke andr string immutable hota change nhi kr skte hai agr change krni hai to new string bnani paregi
        //classes
        //interfaces


        //here string example

        String one = "hello";
        String two = "vivek";
        String add = one + " good Morning !! " + two;
        System.out.println(add);

        String nam = "priyanka";//function uses here of string like:- length(),charAt(),Reaplace()..etc
        System.out.println(nam.length());//length malum kr skte hai
        System.out.println(nam.charAt(7));//first charecter malum kr skte hai ya koie bhi koun sa number hai index start with --0,1,2,3,4,5.....

        //Replace() string //new String bna ke denga old sring ko nhi change krega
        String nm = "Hello HHHaaa";
        String nm2 = nm.replace('H', 'P');//like :-- Hke jagah P  rakhna chahte hai to use kr skte hai
        System.out.println(nm2);

        //SubString
        String sub = "good morning !!";
        System.out.println(sub.substring(0, 4));
    }
}
