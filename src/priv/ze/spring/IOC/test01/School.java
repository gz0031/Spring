package priv.ze.spring.IOC.test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * ClassName:School
 * Package:priv.ze.spring.IOC.test01
 *
 * @date:2019/11/23 20:15
 */
@Scope
@Component("mySchool")//括号内的值代表改bean的id
public class School {
    //基本属性赋值
    @Value("象山中学")
    private String scname;

    //域属型赋值(通过byName方式)
    @Autowired
    @Qualifier("mySchool1")//括号中的内容表示name
    private School1 school;

    //通过byType方式
    @Autowired
    private  School1 school1;

    // JSR-250 (byType)
    @Resource
    private School1 school2;

    // JSR-250 (byName)
    @Resource(name="mySchool1")
    private School1 school3;

    //bean初始化时调用
    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init.");
    }

    //bean销毁前调用
    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }

    @Override
    public String toString() {
        return "School{" +
                "scname='" + scname + '\'' +
                ", school=" + school +
                ", school1=" + school1 +
                ", school2=" + school2 +
                ", school3=" + school3 +
                '}';
    }

    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname;
    }

    public School1 getSchool() {
        return school;
    }

    public void setSchool(School1 school) {
        this.school = school;
    }

    public School1 getSchool1() {
        return school1;
    }

    public void setSchool1(School1 school1) {
        this.school1 = school1;
    }

    public School1 getSchool2() {
        return school2;
    }

    public void setSchool2(School1 school2) {
        this.school2 = school2;
    }

    public School1 getSchool3() {
        return school3;
    }

    public void setSchool3(School1 school3) {
        this.school3 = school3;
    }
}
