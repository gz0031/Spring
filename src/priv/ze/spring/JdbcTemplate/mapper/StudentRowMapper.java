package priv.ze.spring.JdbcTemplate.mapper;

import org.springframework.jdbc.core.RowMapper;
import priv.ze.spring.JdbcTemplate.beans.Student;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * ClassName:StudentRowMapper
 * Package:priv.ze.spring.Dao.mapper
 *
 * @date:2019/12/2 20:46
 */
public class StudentRowMapper implements RowMapper<Student> {
    //当查询出总的结果后，框架会自动遍历这个结果集，每一次遍历的一行数据，都会被存放到这个方法
    //的resultSet参数中，也就是说，这里的resultSet代表的是一行数据，并非所有的查询结果，换个
    // 角度来水哦，只要能执行到这个方法，就说明这里的rs不会是空的
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student=new Student();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        student.setAge(resultSet.getInt("age"));
        return student;
    }
}
