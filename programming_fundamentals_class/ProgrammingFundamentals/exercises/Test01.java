package exercises;


/**
 * Write a description of class Test01 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test01
{
    public static int[] even = new int[5];
    public static int c = 0;
    public static void main(String[] args){
        System.out.println("Hello World");
        for (int i = 1; i < 11; i++){
            if (i % 2 == 0){
                even[c] = i;
                c++;
            }
        }
        for (int num : even){
            System.out.print(num + " ");
        }
    }

}
