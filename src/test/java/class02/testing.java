package class02;

import org.testng.annotations.*;

public class testing {

@BeforeTest
public void beforeTest(){
    System.out.println("I am before the test");
}
@AfterTest
public void afterTest(){
    System.out.println("I am after the test");
}


@BeforeClass
public void beforeClass(){
    System.out.println("I am before class method");
}

@AfterClass
public void afterClass(){
    System.out.println("I am after class method");
}

    @BeforeMethod
    public void before(){
        System.out.println("this is my before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("this is my after method");
    }
    @Test
    public void Test(){
        System.out.println("drive me crazy , drive me mad");
    }
    @Test
    public void Test2(){
        System.out.println("drive me to sanity , drive me to hell");
    }

}
