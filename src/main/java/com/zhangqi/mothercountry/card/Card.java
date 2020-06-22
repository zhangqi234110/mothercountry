package com.zhangqi.mothercountry.card;

import com.zhangqi.mothercountry.pojo.Ticket;
import com.zhangqi.mothercountry.utils.SerializeUtil;
import redis.clients.jedis.Jedis;

public class Card {
    public static void main(String[] args) {

       /* Jedis jedis = new Jedis("localhost");
        byte[] bytes = jedis.get("ticket".getBytes());
        Ticket deserialize = (Ticket) SerializeUtil.deserialize(bytes);
        System.out.println(deserialize.getName()+"  "+deserialize.getCount());*/
    }
}
