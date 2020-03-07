package v.pubg.lol.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 重要程度
     */
    private Integer level;

    /**
     * 产生日期
     */
    private Date happen;

    /**
     * 事件内容
     */
    private String content;

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
     * 获取重要程度
     *
     * @return level - 重要程度
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置重要程度
     *
     * @param level 重要程度
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取产生日期
     *
     * @return happen - 产生日期
     */
    public Date getHappen() {
        return happen;
    }

    /**
     * 设置产生日期
     *
     * @param happen 产生日期
     */
    public void setHappen(Date happen) {
        this.happen = happen;
    }

    /**
     * 获取事件内容
     *
     * @return content - 事件内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置事件内容
     *
     * @param content 事件内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}