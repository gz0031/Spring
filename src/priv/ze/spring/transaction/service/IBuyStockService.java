package priv.ze.spring.transaction.service;

import priv.ze.spring.transaction.Exception.BuyStockException;

/**
 * ClassName:IBuyStockService
 * Package:priv.ze.spring.transaction.service
 *
 * @date:2019/12/4 14:12
 */
public interface IBuyStockService {
    void openAccount(String aname,double money);
    void openStock(String sname,int amount);
    void buyStock(String aname,double money,String sname,int amount) throws BuyStockException;
}
