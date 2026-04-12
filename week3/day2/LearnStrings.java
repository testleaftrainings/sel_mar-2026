package week3.day2;

public class LearnStrings {
    /**
     * Strings
     * -it is a nonprimitive datatype
     * -it is an immutable class
     * Sequence of charcters
     * Implementation:
     * 1)String Literals-->DT varaible name="values";
     * 2)String instantiation
     */
    public static void main(String[] args) {
        //string literals
    String name="Test leaf";
    String name1="Testleaf";
    //String instantition
    String str=new String("WELCOMETO testleaf");
    String str1=new String("Welcome to testleaf");
    //length of the string
    int length=name.length();
    System.out.println(length);
//comparison method(Equals)--->check the content of the string but it is case sensitive
boolean equals = name.equals(name1);
System.out.println(equals);
//==--->compare the memory address
if (str==str1) {
    System.out.println("Address same");
}
System.out.println("address not same");


//contains--->content of the string but it is case sensitive
boolean contains = str.contains("Test");
System.out.println(contains);
//Equalignorecase-->ignore the cases
boolean equalsIgnoreCase = str.equalsIgnoreCase(str1);
System.out.println(equalsIgnoreCase);
//toCharArray--->converts the given string into characters

char[] charArray = name.toCharArray();
for (int i = 0; i < charArray.length; i++) {
    System.out.println(charArray[i]);
}
//charAt--->to retrieve any particular character based on index

char charAt = str.charAt(5);
System.out.println(charAt);
//replace--->REPlace the charcter in the given string
String sT="Testleaf@321";
String replace = sT.replace("T", "1").replace("e", "").replace("f", "#");
System.out.println(replace);
//replaceALL
String replaceAll = sT.replaceAll("[^0-9]","");
System.out.println(replaceAll);
String replaceAll2 = sT.replaceAll("[^A-z]", "");
System.out.println(replaceAll2);
String replaceAll3 = sT.replaceAll("[a-z0-9A-Z]","");

System.out.println(replaceAll3);
//string to integer
String s="123";
System.out.println(s+10);
int stringToInteger = Integer.parseInt(s);
System.out.println(stringToInteger+10);
//split
String ss="Testleaf and Qeagle";//0--->Testleaf,1-->and,2--->Qeagle
String[] split = ss.split(" ");
System.out.println(split[2]);
String[] split2 = ss.split("e");
/**
 *T--0, stl-->1,af and Q-->2,agl--->3

 */
System.out.println(split2[3]);
//substring
String ss1="April";
String substring = ss1.substring(2);
System.out.println(substring);
String substring2 = ss1.substring(1,4);//endindex+1
System.out.println(substring2);



    }

    


}
