package com.example.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lzy
 * @since 2019-10-13
 */
@Data   //注解在类上，自动为所有字段添加@ToString，@EqualsAndHashCode，@Getter为非final字段添加@Setter和@RequiredArgsConstructor本质上相当于几个注解的综合效果
@Getter //注解在属性（类）上，为属性（所有非静态成员变量）提供get()方法
@Setter //注解在属性（类）上，为属性（所有非静态成员变量）提供set()方法
@ToString //该注解的作用是为类自动生成toString()方法
@EqualsAndHashCode//为对象字段自动生成hashCode()和equals()实现
@AllArgsConstructor
@RequiredArgsConstructor
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "name", type = IdType.AUTO)
    private String name;
    private Integer age;
    private String address;
    private String tel;
    private Double weight;

}
