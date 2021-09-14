public class CallByValueForObject2 {

    public static void main(String[] args) {
        Test test = new Test();
        test.name="in Main";
        CallByValueForObject2 callByValueForObject = new CallByValueForObject2();
        callByValueForObject.initializeTest(test);
        System.out.println(test.name);
    }

    private void initializeTest(Test test1) {
        test1.name ="in method" ;
    }
}
class Test{
    public String name;
}

