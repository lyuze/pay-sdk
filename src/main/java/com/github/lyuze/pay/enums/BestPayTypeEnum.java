package com.github.lyuze.pay.enums;

import com.github.lyuze.pay.exception.BestPayException;

/**
 * 支付方式
 * Created by null on 2017/2/14.
 */
public enum BestPayTypeEnum {

    ALIPAY_APP("alipay_app", BestPayPlatformEnum.ALIPAY, "支付宝app"),

    ALIPAY_PC("alipay_pc", BestPayPlatformEnum.ALIPAY, "支付宝pc"),

    ALIPAY_WAP("alipay_wap", BestPayPlatformEnum.ALIPAY, "支付宝wap"),

    ALIPAY_H5("alipay_h5", BestPayPlatformEnum.ALIPAY, "支付宝统一下单(h5)"),

    WXPAY_MP("JSAPI", BestPayPlatformEnum.WX,"微信公众账号支付"),

    WXPAY_MWEB("MWEB", BestPayPlatformEnum.WX, "微信H5支付"),

    WXPAY_NATIVE("NATIVE", BestPayPlatformEnum.WX, "微信Native支付"),

    WXPAY_MINI("JSAPI", BestPayPlatformEnum.WX, "微信小程序支付"),

    WXPAY_APP("APP", BestPayPlatformEnum.WX, "微信APP支付"),
    ;

    private String code;

    private BestPayPlatformEnum platform;

    private String desc;

    BestPayTypeEnum(String code, BestPayPlatformEnum platform, String desc) {
        this.code = code;
        this.platform = platform;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public BestPayPlatformEnum getPlatform() {
        return platform;
    }

    public String getDesc() {
        return desc;
    }

    public static BestPayTypeEnum getByName(String code) {
        for (BestPayTypeEnum bestPayTypeEnum : BestPayTypeEnum.values()) {
            if (bestPayTypeEnum.name().equalsIgnoreCase(code)) {
                return bestPayTypeEnum;
            }
        }
        throw new BestPayException(BestPayResultEnum.PAY_TYPE_ERROR);
    }
}
