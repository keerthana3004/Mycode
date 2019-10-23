/*created by keerthana
lamda expression
 */
package functionalinterface;
@FunctionalInterface/*annotated interface with the annotation*/
interface Calculator
{
   abstract void on();/*functional interface contains only one abstract method*/
}
class lamda
{
    public static void main(String args[])
    {
        Calculator cal=()->System.out.println("perform mathematical calculation");/*lamda expression*/
        cal.on();
    }
}
