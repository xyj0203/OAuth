package com.wojucai.utils.encrypt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.security.InvalidKeyException;

/**
 * @description:测试加密解密
 * @author: xuyujie
 * @date: 2023/05/27
 **/
@SpringBootTest
public class AESEncryptUtilTest {

    @Autowired
    private AESEncryptUtil aesEncryptUtil;

    @Test
    void testEncode() throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        String encode = aesEncryptUtil.encode("123456");
        System.out.println(encode);
        System.out.println(aesEncryptUtil.encode("123").equals(encode));
    }
}
