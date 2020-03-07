package v.pubg.lol.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import v.pubg.lol.core.AbstractService;
import v.pubg.lol.dao.UsersMapper;
import v.pubg.lol.model.Users;
import v.pubg.lol.service.UsersService;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/07.
 */
@Service
@Transactional
public class UsersServiceImpl extends AbstractService<Users> implements UsersService {
    @Resource
    private UsersMapper usersMapper;

}
