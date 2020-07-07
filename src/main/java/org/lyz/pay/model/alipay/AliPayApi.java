package org.lyz.pay.model.alipay;

import org.lyz.pay.model.alipay.response.AliPayOrderCloseResponse;
import org.lyz.pay.model.alipay.response.AliPayOrderCreateResponse;
import org.lyz.pay.model.alipay.response.AliPayOrderQueryResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.Map;

public interface AliPayApi {

    @FormUrlEncoded
    @POST("gateway.do")
    Call<AliPayOrderQueryResponse> orderQuery(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=utf-8")
    @POST("gateway.do")
    Call<AliPayOrderCreateResponse> tradeCreate(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("gateway.do")
    Call<AliPayOrderCloseResponse> close(@FieldMap Map<String, String> map);
}
