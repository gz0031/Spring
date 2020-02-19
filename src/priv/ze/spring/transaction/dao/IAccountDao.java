package priv.ze.spring.transaction.dao;

/**
 * ClassName:IAccountDao
 * Package:priv.ze.spring.transaction.dao
 *
 * @date:2019/12/4 14:26
 */
public interface IAccountDao {
    void insertAccount(String aname,double money);
    void updateAccount(String aname,double money,boolean isBuy);
}
