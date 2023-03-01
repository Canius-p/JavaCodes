//java program to to count occurence of number(it uses split method)


public class Occurence {
public static void main(String args[]) {
String string = "i am at pokhara university";
String word = "i";
String temp[] = string.split(" ");
int count = 0;
for (int i = 0; i < temp.length; i++) {
if (word.equals(temp[i]))
count++;
}
System.out.println("The string is: " + string);
System.out.println("The word " + word + " occurs " + count + " times in the above string");
}
}
