package v.pubg.lol.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import v.pubg.lol.core.AbstractService;
import v.pubg.lol.dao.TagsMapper;
import v.pubg.lol.model.Tags;
import v.pubg.lol.service.TagsService;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/07.
 */
@Service
@Transactional
public class TagsServiceImpl extends AbstractService<Tags> implements TagsService {
    @Resource
    private TagsMapper tagsMapper;

}
