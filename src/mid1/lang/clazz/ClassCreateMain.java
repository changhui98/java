package mid1.lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {

        Class helloClass = Hello.class;
        //Class helloClass = Class.forName("lang.clazz.Hello");

        Hello o = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = o.hello();
        System.out.println("result = " + result);
    }

}
