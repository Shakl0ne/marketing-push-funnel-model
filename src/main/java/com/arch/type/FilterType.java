package com.arch.type;

import com.arch.filter.*;

public enum FilterType {
    WHITE_LIST(1, "白名单", WhiteListFilterImpl.class.getName(), "000001"),
    BLACK_LIST(2, "黑名单", BlackListFilterImpl.class.getName(), "000002"),
    N_LABEL(3, "N标签", NLabelFilterImpl.class.getName(), "000003"),
    COUPON(4, "优惠券", CouponFilterImpl.class.getName(), "000004"),
    TEMPLATE(5, "模板", TemplateFilterImpl.class.getName(), "000005");

    private Integer code;
    private String name;
    private String clazz;
    private String errorCode;

    FilterType(Integer code, String name, String clazz, String errorCode) {
        this.code = code;
        this.name = name;
        this.clazz = clazz;
        this.errorCode = errorCode;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
