package com.chengxiaoxiao.app.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020/5/1 3:41 下午
 * @Description:
 */
@Data
@TableName("tb_user")
@Component
public class User {
    @TableId(value = "id")
    private String id;
    private String userName;
}
