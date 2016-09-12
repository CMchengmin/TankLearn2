package TankLearn2.Learn;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class TestNGLearn1 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
    }

    @Test
    public void TestNgLearn1() {
        System.out.println("this is TestNG111 test case");
    }
    @Test
    public void TestNgLearn2() {
        System.out.println("this is TestNG2222 test case");
    }
    
    @Test
    public void TestNgLearn3() {
        System.out.println("this is TestNG33333 test case");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
}