class A
{
public void M1()
{
	
System.out.println("Welcome to Git");
}
public void M2()
{
	M1();
System.out.println("Welcome to Git12");
}
}
class Main extends A
{
public void M1()
{
System.out.println("Welcome to Git-Hub");
}
public static void main(String args[])
{
A a=new A();
a.M2();
}

}
