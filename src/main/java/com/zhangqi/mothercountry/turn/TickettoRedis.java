package com.zhangqi.mothercountry.turn;

import com.zhangqi.mothercountry.dao.TicketDao;
import com.zhangqi.mothercountry.pojo.Ticket;
import com.zhangqi.mothercountry.utils.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

@Configuration
public class TickettoRedis {
    @Autowired
    private TicketDao ticketDao;

    @Bean
    public Ticket  turn(){
        Ticket ticket = ticketDao.select(1);
        Jedis jedis = new Jedis("localhost");
        jedis.set("ticket".getBytes(), SerializeUtil.serizlize(ticket));
        jedis.close();
        byte[] bytes = jedis.get("ticket".getBytes());
        Ticket ticket2 = (Ticket) SerializeUtil.deserialize(bytes);
        return ticket2;
    }

}
