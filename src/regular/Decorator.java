package regular;
/**
 * Класс декоратора - накладывает некоторую обертку на готовый клас или же декорирует его
 */
public class Decorator {

    /**
     *
     * @param a число требующее декорации
     * @return отформатированная строка
     */
    public static String decorate(int a){
        return String.format("There is your number: %d", a);
    }
}
