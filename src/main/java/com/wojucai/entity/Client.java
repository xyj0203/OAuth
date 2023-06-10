package com.wojucai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:客户端类
 * @author: xuyujie
 * @date: 2023/05/24
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_client")
public class Client {

    /**
     * 客户端Id
     */
    @TableId(type = IdType.AUTO)
    private String clientId;

    /**
     * 客户端密钥
     */
    private String clientSecret;

    /**
     * 认证成功重定向链接
     */
    private String redirectUrl;

    /**
     * 拥有的作用域
     */
    private String scope;
}
