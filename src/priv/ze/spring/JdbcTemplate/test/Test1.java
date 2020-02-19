package priv.ze.spring.JdbcTemplate.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import priv.ze.spring.JdbcTemplate.beans.Student;
import priv.ze.spring.JdbcTemplate.service.IStudentService;

import java.util.List;

/**
 * ClassName:Test
 * Package:priv.ze.spring.Dao.test
 *
 * @date:2019/12/2 18:29
 */
public class Test1 {
    private IStudentService studentService;

    //将公共代码提取出来在每个方法前均执行一次
    @Before
    public void before() {
        String resource = "priv/ze/spring/JdbcTemplate/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        studentService = (IStudentService) ac.getBean("studentService");
    }

    //增
    @Test
    public void  test01() {
        Student student = new Student(6, "张三", 23);
        studentService.addStudent(student);
    }

    //删
    @Test
    public void test02() {
        studentService.removeById(2);
    }

    //改
    @Test
    public void test03() {
        Student student = new Student("张三", 23);
        student.setId(3);
        studentService.modifyStudent(student);
    }

    //查
    @Test
    public void test04(){
        List<String> names=studentService.findAllStudentNames();
        System.out.println(names);
    }

    //查
    @Test
    public void test05(){
        String name=studentService.findStudentNameById(6);
        System.out.println(name);
    }

    //查
    @Test
    public void test06(){
        List<Student> students =studentService.findAllStudents();
        for(Student student:students){
            System.out.println(student);
        }
    }

    //查
    @Test
    public void test07(){
        Student student=studentService.findStudentById(6);
        System.out.println(student);
    }

}
