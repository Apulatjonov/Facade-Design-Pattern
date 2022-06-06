public class FacadePatternMain {
    public static void main(String[] args) {
        Cook cook = new Cook();

        System.out.println(cook.prepareSpaghetti());
        System.out.println(cook.prepareVafli());
        System.out.println(cook.prepareXinkali());
    }
}