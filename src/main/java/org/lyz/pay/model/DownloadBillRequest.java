package org.lyz.pay.model;

import lombok.Data;

/**
 * 下载对账文件请求
 */
@Data
public class DownloadBillRequest {

    //对账日期
    private String billDate;

}
