package com.neo;

import com.neo.entity.User;
import com.neo.util.ValidationUtil;
import lombok.Data;
import org.junit.Test;

import javax.validation.Valid;
import java.io.IOException;

/**
 * @author BigLee E-mail:biglee001@hotmail.com
 * @date 2020/6/17 21:55
 */
public class EnumTest {

    @Test
    public void addUser()throws IOException {

        User user = new User();
        ValidationUtil.ValidResult validResult = ValidationUtil.validateBean(user);
        if(validResult.hasErrors()){
            String errors = validResult.getErrors();
            System.out.println(errors);
        }

    }

}
