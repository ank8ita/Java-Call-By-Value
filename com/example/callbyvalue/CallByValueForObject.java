public class CallByValueForObject {
    class Test{
    }
    public static void main(String[] args) {
        Test test = null;
        CallByValueForObject callByValueForObject = new CallByValueForObject();
        callByValueForObject.initializeTest(test);
        System.out.println(test);
    }

    private void initializeTest(Test test1) {
        test1 = new Test();
    }
}


