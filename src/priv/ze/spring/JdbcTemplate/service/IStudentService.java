package priv.ze.spring.JdbcTemplate.service;

import priv.ze.spring.JdbcTemplate.beans.Student;

import java.util.List;

/**
 * ClassName:IStudentService
 * Package:priv.ze.spring.Dao.domain
 *
 * @date:2019/12/2 18:00
 */
public interface IStudentService {
    void addStudent(Student Student);

    void removeById(int id);

    void modifyStudent(Student student);

    List<String> findAllStudentNames();

    String findStudentNameById(int id);

    List<Student> findAllStudents();

    Student findStudentById(int id);
}
