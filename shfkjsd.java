// Class Activity

class Static_Test_block
{

    static int i;     // static varaible

    int j;       // class varaible/instance

    // start of static block  

    static
    {

        i = 10;

        System.out.println ("static block run before static methods called ");

    }

    // end of static block

    // Start of static methods

    static void test_method ()
    {

        System.out.
                println
                        ("static Method run after static block and main method value of i = " +
                                i);

    }

    // end of static methods  
}

class shfkjsd

{

    public static void main (String args[])
    {


        // Although we don't have an object of Test, static block is  
        // called because i is being accessed in following statement.
        System.out.println ("Run atfer Statict block and value of i = " +
                Static_Test_block.i);

        Static_Test_block obj = new Static_Test_block ();


        Static_Test_block.i = 15;


        obj.test_method ();

    }
}

