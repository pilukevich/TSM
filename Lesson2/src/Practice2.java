import com.tms.utils.Constants;

import static com.tms.utils.Constants.IMAGE_PATH;

public class Practice2 {

    public static void main(String[] args) {
        if (IMAGE_PATH != null) {//константа
        }
        int[] mass = new int[4];

        methtod(mass);
    }

    private static void methtod(int[] mass) {
        //нельзя достучаться до масс переменной из метода можно передать в метод
        int i = 0;

        //рассказать про память heap stack
        //как пробежать по масиву
        //+ массивов мало памяти весит, практически не юзают
    }
}
