package accessModifiers;

public class XVII_ResponseTest {
    public static void main(String[] args) {
        XVII_Response response1 = new XVII_Response(200, "Success");
        XVII_Response response2 = new XVII_Response(400, "Bad Request");

        System.out.println("Response 1: " + response1.isOk());
        System.out.println("Response 2: " + response2.isOk());
    }
}