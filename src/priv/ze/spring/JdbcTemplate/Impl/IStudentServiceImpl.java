package priv.ze.spring.JdbcTemplate.Impl;

import priv.ze.spring.JdbcTemplate.dao.StudentDao;
import priv.ze.spring.JdbcTemplate.beans.Student;
import priv.ze.spring.JdbcTemplate.service.IStudentService;

import java.util.List;

/**
 * ClassName:IStudentServiceImpl
 * Package:priv.ze.spring.Dao.Impl
 *
 * @date:2019/12/2 18:01
 */
public class IStudentServiceImpl implements IStudentService {
    private StudentDao dao ;

    //使用设值注入需要set方法
    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }

    @Override
    public void removeById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void modifyStudent(Student student) {
        dao.updateStudent(student);
    }

    @Override
    public List<String> findAllStudentNames() {

        return dao.selectAllStudentNames();
    }

    @Override
    public String findStudentNameById(int id) {
        return dao.selectStudentNameById(id);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.selectAllStudents();
    }

    @Override
    public Student findStudentById(int id) {
        return dao.selectStudentById(id);
    }
}
