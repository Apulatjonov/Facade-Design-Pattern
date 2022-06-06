import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MealTester {
    @Test
    public void spaghettiTester(){
        Cook cook = new Cook();
        Assertions.assertEquals("Preparing \"Spaghetti\"...", cook.prepareSpaghetti());
    }

    @Test
    public void xinkaliTester(){
        Cook cook = new Cook();
        Assertions.assertEquals("Preparing \"Xinkali\"...", cook.prepareXinkali());
    }

    @Test
    public void vafliTester(){
        Cook cook = new Cook();
        Assertions.assertEquals("Preparing \"Vafli\"...", cook.prepareVafli());
    }
}
