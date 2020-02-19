package priv.ze.spring.IOC.test01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ClassName:School1
 * Package:priv.ze.spring.IOC.test01
 *
 * @date:2020/1/31 0:17
 */
@Component("mySchool1")
public class School1 {
    @Value("西安邮电大学")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School1{" +
                "name='" + name + '\'' +
                '}';
    }
}
