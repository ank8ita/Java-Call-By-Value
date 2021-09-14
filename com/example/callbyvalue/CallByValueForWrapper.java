public class CallByValueForWrapper {

    public static void main(String[] args) {
        Integer test = 10;
        CallByValueForWrapper callByValueForObject = new CallByValueForWrapper();
        callByValueForObject.initializeTest(test);
        System.out.println(test);
    }

    private void initializeTest(Integer test1) {
        test1 = 5;
    }
}

