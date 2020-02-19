package priv.ze.spring.Mybatis.dao;

import priv.ze.spring.Mybatis.beans.Student;

import java.util.List;

/**
 * ClassName:IStudentDao
 * Package:priv.ze.spring.Dao.dao
 *
 * @date:2019/12/2 18:02
 */
public interface StudentDaomapper {

    void insertStudent(Student Student);

    void deleteStudent(int id);

    void updateStudent(Student student);

    List<Student> selectAllStudents();

    Student selectStudentById(int id);

}
