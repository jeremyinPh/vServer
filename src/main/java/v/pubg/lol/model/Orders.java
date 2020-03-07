package v.pubg.lol.model;

import java.util.Date;
import javax.persistence.*;

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 货币对
     */
    private String currency;

    /**
     * 起始日期
     */
    private Date st;

    /**
     * 关闭日期
     */
    private Date en;

    /**
     * 手数
     */
    private String hand;

    /**
     * 起始点
     */
    private String p1;

    /**
     * 关闭点
     */
    private String p2;

    /**
     * 盈利
     */
    private Double profit;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取货币对
     *
     * @return currency - 货币对
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置货币对
     *
     * @param currency 货币对
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 获取起始日期
     *
     * @return st - 起始日期
     */
    public Date getSt() {
        return st;
    }

    /**
     * 设置起始日期
     *
     * @param st 起始日期
     */
    public void setSt(Date st) {
        this.st = st;
    }

    /**
     * 获取关闭日期
     *
     * @return en - 关闭日期
     */
    public Date getEn() {
        return en;
    }

    /**
     * 设置关闭日期
     *
     * @param en 关闭日期
     */
    public void setEn(Date en) {
        this.en = en;
    }

    /**
     * 获取手数
     *
     * @return hand - 手数
     */
    public String getHand() {
        return hand;
    }

    /**
     * 设置手数
     *
     * @param hand 手数
     */
    public void setHand(String hand) {
        this.hand = hand;
    }

    /**
     * 获取起始点
     *
     * @return p1 - 起始点
     */
    public String getP1() {
        return p1;
    }

    /**
     * 设置起始点
     *
     * @param p1 起始点
     */
    public void setP1(String p1) {
        this.p1 = p1;
    }

    /**
     * 获取关闭点
     *
     * @return p2 - 关闭点
     */
    public String getP2() {
        return p2;
    }

    /**
     * 设置关闭点
     *
     * @param p2 关闭点
     */
    public void setP2(String p2) {
        this.p2 = p2;
    }

    /**
     * 获取盈利
     *
     * @return profit - 盈利
     */
    public Double getProfit() {
        return profit;
    }

    /**
     * 设置盈利
     *
     * @param profit 盈利
     */
    public void setProfit(Double profit) {
        this.profit = profit;
    }
}