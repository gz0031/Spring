package priv.ze.spring.transaction.Impl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import priv.ze.spring.transaction.Exception.BuyStockException;
import priv.ze.spring.transaction.dao.IAccountDao;
import priv.ze.spring.transaction.dao.IStockDao;
import priv.ze.spring.transaction.service.IBuyStockService;

/**
 * ClassName:IBuyStockServiceImpl
 * Package:priv.ze.spring.transaction.Impl
 *
 * @date:2019/12/4 14:17
 */
public class IBuyStockServiceImpl implements IBuyStockService {
    private IAccountDao adao;
    private IStockDao sdao;

    public void setAdao(IAccountDao adao) {
        this.adao = adao;
    }

    public void setSdao(IStockDao sdao) {
        this.sdao = sdao;
    }

    @Override
    public void openAccount(String aname, double money) {
        adao.insertAccount(aname,money);
    }

    @Override
    public void openStock(String sname, int amount) {
        sdao.insertStock(sname,amount);
    }

    @Override
    public void buyStock(String aname, double money, String sname, int amount) throws BuyStockException {
        boolean isBuy =true;
        adao.updateAccount(aname,money,isBuy);
        if (1==1){
            throw new BuyStockException("购买股票异常");
        }
        sdao.updateStock(sname,amount,isBuy);
    }
}
