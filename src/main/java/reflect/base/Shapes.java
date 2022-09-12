package reflect.base;

import java.util.stream.Stream;

/**
 * @author gongcy
 * @date 2022/9/12 10:01 上午
 * @Description
 */
public class Shapes {

    public static void main(String[] args) {
        Stream.of(
                new Circle(),new Square(),new Triangle()
        ).forEach(Shape::draw);
    }
}
