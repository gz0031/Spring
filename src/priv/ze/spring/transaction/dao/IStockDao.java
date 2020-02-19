package priv.ze.spring.transaction.dao;

/**
 * ClassName:IStockDao
 * Package:priv.ze.spring.transaction.dao
 *
 * @date:2019/12/4 14:26
 */
public interface IStockDao {
     void insertStock(String sname,int smount);
     void updateStock(String sname,int amount,boolean isBuy);
}
