package Day07;

/**
 * @ClassName MarkeEmployee
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/10/26
 **/

public class MarkeEmployee extends BaseEmployee {
    private String id;
    private static final String ADMIN = "admin";
    private static final int HIGHER_SALARY = 3000;
    private static final int LOWER_SALARY = 1000;

    public MarkeEmployee(String id) {
        this.id = id;
    }

    public MarkeEmployee() {
    }

    @Override
    public void print() {
        super.print();
        System.out.println("This is a MarketEmployee class");
    }

    @Override
    public int getSalary() {
        if (ADMIN.equals(this.id)) {
            return HIGHER_SALARY;
        } else {
            return LOWER_SALARY;
        }
    }
}
