/**
 * IV. Таблица приведения типов
 * ----------------------------------------------------------------------------
 * from \ to	byte	short	char	int	    long	float	double	boolean
 * ----------------------------------------------------------------------------
 * byte	        т	    ня	    я	    ня	    ня	    ня	    ня	    х
 * short	    я	    т	    я	    ня	    ня	    ня	    ня	    х
 * char	        я	    я	    т	    ня	    ня	    ня	    ня	    х
 * int	        я	    я	    я	    т	    ня	    ня	    ня	    х
 * long	        я	    я	    я	    я	    т	    ня	    ня	    х
 * float	    я	    я	    я	    я	    я	    т	    ня	    х
 * double	    я	    я	    я	    я	    я	    я	    т	    х
 * boolean	    х	    х	    х	    х	    х	    х	    х	    т
 * ---------------------------------------------------------------------------
 * ня — неявное преобразование (widening conversion, безопасно, без потерь).
 * я — явное преобразование (narrowing conversion, может привести к потере данных).
 * т — тождественно (тип в тип).
 * х — невозможно.
 * ---------------------------------------------------------------------------
 * V. Создать программу, в которой последовательно прописать преобразования
 * всех совместимых примитивных типов друг к другу.
 * Преобразование для каждого типа вынесите в отдельный метод.
 */

package lesson3;

public class IV_V_DatatypeConversion {
    public static void main(String[] args) {
        fromByte((byte) 70);
        fromShort((short) 1000);
        fromChar('A');
        fromInt(12345);
        fromLong(67890L);
        fromFloat(123.456f);
        fromDouble(789.01);
    }

    static void fromByte(byte byteType) {
        short shortType = byteType;
        char charType = (char) byteType;
        int intType = byteType;
        long longType = byteType;
        float floatType = byteType;
        double doubleType = byteType;

        System.out.println("From byte: "
                + shortType + ", "
                + charType + ", "
                + intType + ", "
                + longType + ", "
                + floatType + ", "
                + doubleType);
    }

    static void fromShort(short shortType) {
        byte byteType = (byte) shortType;
        char charType = (char) shortType;
        int intType = shortType;
        long longType = shortType;
        float floatType = shortType;
        double doubleType = shortType;

        System.out.println("From short: "
                + byteType + ", "
                + charType + ", "
                + intType + ", "
                + longType + ", "
                + floatType + ", "
                + doubleType);
    }

    static void fromChar(char charType) {
        byte byteType = (byte) charType;
        short shortType = (short) charType;
        int intType = charType;
        long longType = charType;
        float floatType = charType;
        double doubleType = charType;

        System.out.println("From char: "
                + byteType + ", "
                + shortType + ", "
                + intType + ", "
                + longType + ", "
                + floatType + ", "
                + doubleType);
    }

    static void fromInt(int intType) {
        byte byteType = (byte) intType;
        short shortType = (short) intType;
        char charType = (char) intType;
        long longType = intType;
        float floatType = intType;
        double doubleType = intType;

        System.out.println("From int: "
                + byteType + ", "
                + shortType + ", "
                + charType + ", "
                + longType + ", "
                + floatType + ", "
                + doubleType);
    }

    static void fromLong(long longType) {
        byte byteType = (byte) longType;
        short shortType = (short) longType;
        char charType = (char) longType;
        int intType = (int) longType;
        float floatType = longType;
        double doubleType = longType;

        System.out.println("From long: "
                + byteType + ", "
                + shortType + ", "
                + charType + ", "
                + intType + ", "
                + floatType + ", "
                + doubleType);
    }

    static void fromFloat(float floatType) {
        byte byteType = (byte) floatType;
        short shortType = (short) floatType;
        char charType = (char) floatType;
        int intType = (int) floatType;
        long longType = (long) floatType;
        double doubleType = floatType;

        System.out.println("From float: "
                + byteType + ", "
                + shortType + ", "
                + charType + ", "
                + intType + ", "
                + longType + ", "
                + doubleType);
    }

    static void fromDouble(double doubleType) {
        byte byteType = (byte) doubleType;
        short shortType = (short) doubleType;
        char charType = (char) doubleType;
        int intType = (int) doubleType;
        long longType = (long) doubleType;
        float floatType = (float) doubleType;

        System.out.println("From double: "
                + byteType + ", "
                + shortType + ", "
                + charType + ", "
                + intType + ", "
                + longType + ", "
                + floatType);
    }
}
