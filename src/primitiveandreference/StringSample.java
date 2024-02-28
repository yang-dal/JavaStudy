package primitiveandreference;

public class StringSample {
    public static void main(String[] args) {
        String myString = "myString";
        String byteString = "10";
        byte fromStringByte = Byte.parseByte(byteString);
        String falseString = "false";
        String trueString = "true";
        boolean fromStringbool = Boolean.parseBoolean(falseString);

        float fromLiteral = 10.123f;

        long fromLiteralLong = 10000000L;

        String floatString  = "10.123";
        String floatString2 = "10.123"; // String은 힙영역에서 스트링 풀로 관리
        String floatString3 = "10.123";

        String floatString4 = new String("10.123"); // 힙영역의 스트링 풀로 안가고 새로 만들어서 주소값 갖고옴

        float fromStringfloat = Float.parseFloat(floatString);

    }
}
