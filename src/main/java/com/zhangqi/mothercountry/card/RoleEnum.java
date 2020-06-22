package com.zhangqi.mothercountry.card;

public enum RoleEnum implements RoleOperation {

    A{
        @Override
        public String op(String name) {
            return "我是A,我的名字叫"+name;
        }
    },

    B{
        @Override
        public String op(String name) {
            return "我是B,我的名字叫"+name;
        }
    },
    C{
        @Override
        public String op(String name) {
            return "我是C,我的名字叫"+name;
        }
    },

    ;


}
