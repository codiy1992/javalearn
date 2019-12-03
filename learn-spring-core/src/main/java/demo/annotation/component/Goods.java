package demo.annotation.component;

import org.springframework.stereotype.Component;

/**
 * @author codiy
 */
@Component
public class Goods {

    public String name;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                '}';
    }
}
