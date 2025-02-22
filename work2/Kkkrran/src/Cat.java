/**
 * Date 2023/10/18  13:34
 *
 * @author Kkkrran
 * @version 1.0
 */
public class Cat extends Animal {
    public Cat(String name, int age, String sex, double price) {
        //fix_bug: price constantly equals certain value
        super(name, age, sex, price);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                '}';
    }

}
