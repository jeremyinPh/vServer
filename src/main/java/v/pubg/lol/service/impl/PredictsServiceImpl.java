package v.pubg.lol.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import v.pubg.lol.core.AbstractService;
import v.pubg.lol.dao.PredictsMapper;
import v.pubg.lol.model.Predicts;
import v.pubg.lol.service.PredictsService;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/07.
 */
@Service
@Transactional
public class PredictsServiceImpl extends AbstractService<Predicts> implements PredictsService {
    @Resource
    private PredictsMapper predictsMapper;

}
