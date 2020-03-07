package v.pubg.lol.dao;

import v.pubg.lol.model.Tagsmap;

import java.util.List;

public interface TagsmapMapper {

    Integer insert(Tagsmap item);

    List<Tagsmap> getAll();
}