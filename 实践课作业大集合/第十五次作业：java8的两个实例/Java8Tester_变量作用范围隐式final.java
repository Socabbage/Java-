import com.sun.xml.internal.ws.commons.xmlutil.Converter;

public class Java8Tester_变量作用范围隐式final {
    public static void main(String[] args) {
        final int num = 1;
        Converter<Integer, String> s =(param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);
    }
    public interface Converter<T1, T2> {
        void convert(int i);
    }
}
