package Day05;

/**
 * @ClassName Bactangle
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/10/24
 **/

public class Rectangle extends BaseGraph {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public double getCircumference() {
        return 2 * (length + width);
    }
}
