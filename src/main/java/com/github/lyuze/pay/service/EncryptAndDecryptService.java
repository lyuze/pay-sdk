package com.github.lyuze.pay.service;

/**
 * 加解密
 * Created by lyuze
 * 2018-05-30 16:15
 */
public interface EncryptAndDecryptService {

    /**
     * 加密
     * @param key
     * @param data
     * @return
     */
    Object encrypt(String key, String data);


    /**
     * 解密
     * @param key
     * @param data
     * @return
     */
    Object decrypt(String key, String data);
}
