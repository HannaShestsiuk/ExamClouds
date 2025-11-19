package accessModifiers;

public class XVII_Response {
    private int code;
    private String body;

    public XVII_Response(int code, String body) {
        this.code = code;
        this.body = body;
    }

    public boolean isOk(){
        return code == 200;
    }
}