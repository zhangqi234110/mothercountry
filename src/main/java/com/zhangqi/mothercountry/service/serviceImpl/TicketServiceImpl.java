package com.zhangqi.mothercountry.service.serviceImpl;

import com.zhangqi.mothercountry.dao.TicketDao;
import com.zhangqi.mothercountry.pojo.Ticket;
import com.zhangqi.mothercountry.service.TicketService;
import com.zhangqi.mothercountry.vo.ResponseVo;
import com.zhangqi.mothercountry.vo.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketDao ticketDao;

    @Override
    @Transactional
    public ResponseVo byone(int id) {
        Ticket ticket = ticketDao.select(id);
        if (ticket.getCount()<1){
            String tip="票已售完";
            return  ResponseVo.Success(StatusCode.OPERATION_SUCCESS.getCode(),StatusCode.OPERATION_SUCCESS.getMessage(),tip);

        }else {
            int byone = ticketDao.byone(id);
            return ResponseVo.Success(StatusCode.BY_SUCCESS.getCode(),StatusCode.BY_SUCCESS.getMessage());
        }

    }



}
