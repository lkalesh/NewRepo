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
public void M3()
{
System.out.println("Welcome to Git-Hub1");
}
public static void main(String args[])
{
A a=new A();
a.M2();
}

}
