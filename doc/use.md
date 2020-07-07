# 使用文档(以微信公众账号支付为例)

## 文字教程
1. 配置

    ```
    //微信支付配置
    WxPayConfig wxPayConfig = new WxPayConfig();
    wxPayConfig.setAppId("xxxxx");          //公众号Id
    wxPayConfig.setMiniAppId("xxxxx");      //小程序Id
	wxPayConfig.setAppAppId("xxxxx");       //移动AppId
    //支付商户资料
    wxPayConfig.setMchId("xxxxxx");
    wxPayConfig.setMchKey("xxxxxxx");
    wxPayConfig.setNotifyUrl("http://xxxxx");
    
    //支付宝配置
    AliPayConfig aliPayConfig = new AliPayConfig();
    aliPayConfig.setAppId("xxxxxx");
    aliPayConfig.setPrivateKey("xxxxxx");
    aliPayConfig.setAliPayPublicKey("xxxxxx");
    aliPayConfig.setReturnUrl("http://xxxxx");
    aliPayConfig.setNotifyUrl("http://xxxxx");
            
    //支付类, 所有方法都在这个类里
    BestPayServiceImpl bestPayService = new BestPayServiceImpl();
    bestPayService.setWxPayConfig(wxPayConfig);
    bestPayService.setAliPayConfig(aliPayConfig);
    ```

    
1. 发起支付

        PayRequest payRequest = new PayRequest();
        payRequest.setPayTypeEnum(BestPayTypeEnum.WXPAY_H5);
        payRequest.setOrderId("123456");
        payRequest.setOrderName("微信公众账号支付订单");
        payRequest.setOrderAmount(0.01);
        payRequest.setOpenid("openid_xxxxxx");
        bestPayService.pay(payRequest);
    
1. 异步回调

    ```
    bestPayService.asyncNotify();
    ```


