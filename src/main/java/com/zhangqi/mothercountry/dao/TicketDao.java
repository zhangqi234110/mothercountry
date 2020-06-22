package com.zhangqi.mothercountry.dao;

import com.zhangqi.mothercountry.pojo.Ticket;
import com.zhangqi.mothercountry.service.TicketService;


public interface TicketDao {
    Ticket select(int id);
    int byone(int id);

}
