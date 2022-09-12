package reflect.load;

/**
 * @author gongcy
 * @date 2022/9/12 10:15 上午
 * @Description
 */
public class SweetShop {

    public static void main(String[] args) {
        System.out.println("inside man");
        new Candy();
        System.out.println("After Creating Candy");

        try {
            Class<?> clazz = Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find Gum ");
        }

        System.out.println("After Class.forName(\"Gum\") ");
        new Cookie();
        System.out.println("After Creating Cookie");

    }
}
