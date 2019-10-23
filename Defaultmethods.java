/*created by keerthana
static and default methods*/
package Default;
interface Maths
{
    void add();/*abstract methods*/

    default void sub()/*by using default methods implementing the methods*/
    {
        System.out.println("perform subraction");
    }
    static void mul()/*static methods*/
{
    System.out.println("perform multiplication");
}
}

class Mathematics implements Maths
{
    public void add() {
        System.out.println("perform addition");
    }
}
    public class Defaultmethods
    {
        public static  void main(String[] args)
        {
            Maths obj = new Mathematics();
            obj.add();
            obj.sub();
            Maths.mul();
        }


    }


