package priv.ze.spring.transaction.Impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import priv.ze.spring.transaction.dao.IAccountDao;

/**
 * ClassName:IAccountDaoImpl
 * Package:priv.ze.spring.transaction.Impl
 *
 * @date:2019/12/4 14:36
 */
public class IAccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    @Override
    public void insertAccount(String aname, double money) {
        String sql = "insert into account(aname,balance) values(?,?)";
        this.getJdbcTemplate().update(sql, aname, money);
    }

    @Override
    public void updateAccount(String aname, double money, boolean isBuy) {
        String sql=sql = "update account set balance=balance+? where aname=?";
        if (isBuy) {
             sql = "update account set balance=balance-? where aname=?";
        }
        this.getJdbcTemplate().update(sql,money,aname);
    }

}
