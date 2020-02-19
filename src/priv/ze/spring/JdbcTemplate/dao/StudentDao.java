package priv.ze.spring.JdbcTemplate.dao;

import priv.ze.spring.JdbcTemplate.beans.Student;

import java.util.List;

/**
 * ClassName:IStudentDao
 * Package:priv.ze.spring.Dao.dao
 *
 * @date:2019/12/2 18:02
 */
public interface StudentDao {
    void insertStudent(Student Student);

    void deleteById(int id);

    void updateStudent(Student student);

    List<String> selectAllStudentNames();

    String selectStudentNameById(int id);

    List<Student> selectAllStudents();

    Student selectStudentById(int id);
}
