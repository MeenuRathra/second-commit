package Testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing {

@BeforeSuite
public static void a() {
	
	System.out.println("before suit");
	
}
@BeforeTest
public static void b() {
	
	System.out.println("before test");
	}
@BeforeClass
public static void c() {
	
	System.out.println("before class");
}
@BeforeMethod
public static void d() {
	
	System.out.println("before method");
}
@Test(priority=1)
public static void e() {
	
	System.out.println("test");
}
@Test(priority=2)
public static void f() {
	
	System.out.println("test2");
}

@AfterTest
public static void h() {
	
	System.out.println("after test");
}
@AfterMethod
public static void i() {
System.out.println("aftermethod");	
}
@AfterSuite
public static void j() {
	
	System.out.println("after suit");
}

@AfterClass
public static void k() {
	
	System.out.println("after class");
}
}
	