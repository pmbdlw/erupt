package xyz.erupt.annotation.sub_field.sub_edit;

import xyz.erupt.annotation.config.Comment;

/**
 * @author YuePeng
 * date 2020-05-21
 */
public @interface DependBy {

    @Comment("依赖字段名")
    String dependField();

    @Comment("显示条件表达式，支持变量：value 该值表示依赖字段的值")
    String expr();

    @Comment("依赖类型")
    Type type() default Type.SHOW;


    enum Type {
        SHOW,
        SHOW_NOTNULL,
        READONLY,
        NOTNULL
    }

}
