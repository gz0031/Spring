package priv.ze.spring.Mybatis.Impl;

import priv.ze.spring.Mybatis.beans.Student;
import priv.ze.spring.Mybatis.dao.StudentDaomapper;
import priv.ze.spring.Mybatis.service.IStudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:IStudentServiceImpl
 * Package:priv.ze.spring.Dao.Impl
 *
 * @date:2019/12/2 18:01
 */
public class IStudentServiceImpl implements IStudentService {
    private StudentDaomapper dao ;

    //使用设值注入需要set方法
    public void setDao(StudentDaomapper dao) {
        this.dao = dao;
    }

    @Override
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }

    @Override
    public void removeById(int id) {
        dao.deleteStudent(id);
    }

    @Override
    public void modifyStudent(Student student) {
        dao.updateStudent(student);
    }

    @Override
    public List<String> findAllStudentNames() {
        List<Student> students= this.findAllStudents();
        List<String> list=new ArrayList<>();
        for(Student student:students){
            list.add(student.getName());
        }
        return list;
    }

    @Override
    public String findStudentNameById(int id) {
        Student student=this.findStudentById(id);
        return student.getName();
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
