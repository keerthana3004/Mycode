package Default;
interface Maths
{
    void add();

    default void sub()
    {
        System.out.println("perform subraction");
    }
    static void mul()
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


