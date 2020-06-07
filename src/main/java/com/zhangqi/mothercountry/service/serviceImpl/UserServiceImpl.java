package com.zhangqi.mothercountry.service.serviceImpl;

import com.zhangqi.mothercountry.dao.UserDao;
import com.zhangqi.mothercountry.pojo.User;
import com.zhangqi.mothercountry.service.UserService;
import com.zhangqi.mothercountry.vo.ResponseVo;
import com.zhangqi.mothercountry.vo.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.rmi.registry.Registry;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public ResponseVo register(int id,String name,String password,String uid) {
        int register = userDao.register(id,name,password,uid);
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(StatusCode.REGISTER_SUCCESS.getCode());
        responseVo.setMessag(StatusCode.REGISTER_SUCCESS.getMessage());
        return responseVo;
    }

    @Override
    public ResponseVo login(String name, String password) {
        String uid = userDao.login(name, password);
        if (uid!=null){
            return ResponseVo.Success(StatusCode.LOGIN_SUCCESS.getCode(),StatusCode.LOGIN_SUCCESS.getMessage(),uid);
        }else {
            return ResponseVo.Success(StatusCode.REGISTER_TIP.getCode(),StatusCode.REGISTER_TIP.getMessage());

        }

    }
}
