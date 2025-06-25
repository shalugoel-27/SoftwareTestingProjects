package ex027_Enum;

public class LAb200 {
    public static void main(String[] args) {
        System.out.println(Colors.RED.getHexCode());
    }
}
enum Colors{
    RED("#FF0000"),
    Yellow("4477FF"),
    Green("#61FF33");

    private String hexCode;

    Colors(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }

   //keeping ur constants in a bttr way
}