package xyz.lilei123.pojo.enums;

/**
 * @ClassName OrderTyoe
 * @Description TODO
 * @Author lilei
 * @Date 25/03/2019 14:28
 * @Version 1.0
 **/
public enum OrderType {
    APPLY("申购"),
    REDEEM("赎回");

    private String desc;

    OrderType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
