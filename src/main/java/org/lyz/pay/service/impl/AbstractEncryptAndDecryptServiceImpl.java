package org.lyz.pay.service.impl;

import org.lyz.pay.service.EncryptAndDecryptService;

/**
 * Created by lyuze
 * 2018-05-30 16:21
 */
abstract class AbstractEncryptAndDecryptServiceImpl implements EncryptAndDecryptService {

    /**
     * 加密
     *
     * @param key
     * @param data
     * @return
     */
    @Override
    public Object encrypt(String key, String data) {
        return null;
    }

    /**
     * 解密
     *
     * @param key
     * @param data
     * @return
     */
    @Override
    public Object decrypt(String key, String data) {
        return null;
    }
}
