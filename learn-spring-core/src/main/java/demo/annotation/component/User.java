package demo.annotation.component;

import org.springframework.stereotype.Component;

/**
 * @author codiy
 */
@Component
public class User {

    public String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
