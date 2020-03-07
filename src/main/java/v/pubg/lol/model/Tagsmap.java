package v.pubg.lol.model;

public class Tagsmap {
    /**
     * 标签id
     */
    private Integer tagid;

    /**
     * 其他表id
     */
    private String tid;

    /**
     * 获取标签id
     *
     * @return tagid - 标签id
     */
    public Integer getTagid() {
        return tagid;
    }

    /**
     * 设置标签id
     *
     * @param tagid 标签id
     */
    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    /**
     * 获取其他表id
     *
     * @return tid - 其他表id
     */
    public String getTid() {
        return tid;
    }

    /**
     * 设置其他表id
     *
     * @param tid 其他表id
     */
    public void setTid(String tid) {
        this.tid = tid;
    }
}