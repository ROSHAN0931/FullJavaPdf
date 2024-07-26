class nec<t> //generic class
{
    t n; //generic variable
    nec(t n) //constructor //g.parameter //10
    {
        this.n=n;//10
    }
    public t abc() //declared type as generic
    {
        return n;//10
    }
}

class genericclass
{
    public static void main(String[] args) {
        //generic declaration
        //Basetype<type> objname = new basetype<type>();
        nec<Integer> a1= new nec<Integer>(10);
        System.out.println(a1.abc());
        nec<String> a2= new nec<String>("Ooty");
        System.out.println(a2.abc());
    }
}