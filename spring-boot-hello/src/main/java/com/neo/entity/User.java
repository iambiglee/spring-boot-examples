package com.neo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author BigLee E-mail:biglee001@hotmail.com
 * @date 2020/6/17 23:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NotNull(message ="用户的Id不能为空")
    private String id;

    @NotNull(message ="用户的账号不能为空")
    private String account;
}
