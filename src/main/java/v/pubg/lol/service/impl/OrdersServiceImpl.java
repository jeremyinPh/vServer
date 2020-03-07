package v.pubg.lol.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import v.pubg.lol.core.AbstractService;
import v.pubg.lol.dao.OrdersMapper;
import v.pubg.lol.model.Orders;
import v.pubg.lol.service.OrdersService;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/07.
 */
@Service
@Transactional
public class OrdersServiceImpl extends AbstractService<Orders> implements OrdersService {
    @Resource
    private OrdersMapper ordersMapper;

}
