package v.pubg.lol.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import v.pubg.lol.dao.TagsmapMapper;
import v.pubg.lol.model.Tagsmap;

import java.util.List;


@Service
public class TagsmapServiceImpl {

    @Autowired
    private TagsmapMapper tagsmapMapper;

    public Integer insert(Tagsmap item) {
        return tagsmapMapper.insert(item);
    }

    public List<Tagsmap> getAll() {
        return tagsmapMapper.getAll();
    }
}
