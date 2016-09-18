class A
{
public void M1()
{
	
System.out.println("Welcome to Git");
}
public void M2()
{
System.out.println("Welcome to Git12");
}
public void M4()
{
System.out.println("Welcome to Git-Hub231");
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
public void M2()
{
	System.out.println("Welcome to Git1234");
}
public static void main(String args[])
{
A a=new Main();
a.M2();
}

}
