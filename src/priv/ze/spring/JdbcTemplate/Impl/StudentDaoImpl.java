package priv.ze.spring.JdbcTemplate.Impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import priv.ze.spring.JdbcTemplate.dao.StudentDao;
import priv.ze.spring.JdbcTemplate.beans.Student;
import priv.ze.spring.JdbcTemplate.mapper.StudentRowMapper;

import java.util.List;

/**
 * ClassName:StudentDaoImpl
 * Package:priv.ze.spring.Dao.Impl
 * Spring的Jdbc模板
 *
 * @date:2019/12/2 18:17
 */
public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {
    //对于增删改操作统一使用update
    @Override
    //增
    public void insertStudent(Student student) {
        String sql = "insert into student(id,name,age) values(?,?,?)";
        this.getJdbcTemplate().update(sql, student.getId(), student.getName(), student.getAge());
    }

    //删
    @Override
    public void deleteById(int id) {
        String sql = "delete from student where id=?";
        this.getJdbcTemplate().update(sql, id);
    }

    //改
    @Override
    public void updateStudent(Student student) {
        String sql = "update student set name=?,age=? where id=?";
        this.getJdbcTemplate().update(sql, student.getName(), student.getAge(), student.getId());
    }

    //查
    @Override
    public List<String> selectAllStudentNames() {
        String sql="select name from student";
        //查询出的是普通类型的list时使用queryForList
        return this.getJdbcTemplate().queryForList(sql,String.class);
    }

    //查
    @Override
    public String selectStudentNameById(int id) {
        String sql="select name from student where id=?";
        //查询出的是一单一对象时使用queryForObject
        return this.getJdbcTemplate().queryForObject(sql,String.class,id);
    }

    @Override
    public List<Student> selectAllStudents() {
        String sql="select id,name,age from student";
        //查询出的是自定义类型的list使用query
        return this.getJdbcTemplate().query(sql,new StudentRowMapper());
    }

    @Override
    public Student selectStudentById(int id) {
        String sql="select id,name,age from student where id=?";
        //查询出的是一单一对象时使用queryForObject
        return this.getJdbcTemplate().queryForObject(sql,new StudentRowMapper(),id);
    }
}
