package xyz.lilei123.pojo.enums;

/**
 * @ClassName OrderStatus
 * @Description TODO
 * @Author lilei
 * @Date 25/03/2019 11:17
 * @Version 1.0
 **/
public enum OrderStatus {
    INIT("初始化"),
    PROCESS("处理中"),
    SUCCESS("成功"),
    FAIL("失败");

    private String desc;

    OrderStatus(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
