/**
 * Проверка HTTP-ответа для smoke-проверки
 * Задача. Метод:
 * public static boolean assertBasicHttpResponse(int statusCode, String contentType)
 * Требования:
 * Допустимые коды: 200, 201, 204. Иначе UnexpectedStatusCodeException.
 * contentType должен начинаться с application/json (можно с ; charset=). Иначе UnexpectedContentTypeException.
 * Обработка исключений (multi-catch) внутри, вернуть true/false.
 * Исключения: по два конструктора.
 * Примеры:
 * assertBasicHttpResponse(200, "application/json") → true
 * assertBasicHttpResponse(200, "text/html") → false
 * assertBasicHttpResponse(404, "application/json") → false
 */
package exceptions.httpResponseValidator;

public class HttpResponseValidator {
    public static boolean assertBasicHttpResponse(int statusCode, String contentType){
        try{
            if(statusCode != 200 && statusCode != 201 && statusCode != 204){
                throw new UnexpectedStatusCodeException("Unexpected Status Code: " + statusCode);
            }

            if (statusCode == 204) {
                System.out.println("Valid HTTP Response (204 No Content).");
                return true;
            }

            if( contentType == null || !contentType.startsWith("application/json")){
                throw new UnexpectedContentTypeException("Unexpected Content-Type: " + contentType + ". application/json is expected.");
            }
            System.out.println("Valid HTTP Response.");
            return true;
        }
        catch(UnexpectedStatusCodeException | UnexpectedContentTypeException e){
            System.out.println("Invalid response: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(assertBasicHttpResponse(200, "application/json"));
        System.out.println(assertBasicHttpResponse(201, "application/json; charset=UTF-8"));
        System.out.println(assertBasicHttpResponse(404, "application/json"));
        System.out.println(assertBasicHttpResponse(200, null));
    }
}
