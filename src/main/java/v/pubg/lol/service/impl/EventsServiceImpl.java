package v.pubg.lol.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import v.pubg.lol.core.AbstractService;
import v.pubg.lol.dao.EventsMapper;
import v.pubg.lol.model.Events;
import v.pubg.lol.service.EventsService;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/07.
 */
@Service
@Transactional
public class EventsServiceImpl extends AbstractService<Events> implements EventsService {
    @Resource
    private EventsMapper eventsMapper;

}
