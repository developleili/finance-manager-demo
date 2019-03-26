package xyz.lilei123.pojo.enums;

/**
 * @ClassName ProductStatus
 * @Description TODO
 * @Author lilei
 * @Date 25/03/2019 14:27
 * @Version 1.0
 **/
public enum ProductStatus {
    AUDITING("审核中"),

    IN_SELL("销售中"),

    LOCKED("暂停销售"),

    FINISHED("已结束");

    private String desc;

    ProductStatus(String desc) {

        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
