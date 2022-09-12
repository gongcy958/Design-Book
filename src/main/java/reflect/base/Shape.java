package reflect.base;

/**
 * @author gongcy
 * @date 2022/9/12 9:56 上午
 * @Description
 */
public abstract class Shape {

    void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    public abstract String toString();
}
