/*created by keerthana
default and static methods*/
package Default;
interface Maths
{
    void add();/*abstract method*/

    default void sub()/*default methods are used to implement the method*/
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
    public class mathoperation
    {
        public static  void main(String[] args)
        {
            Maths obj = new Mathematics();
            obj.add();
            obj.sub();
            Maths.mul();
        }


    }


