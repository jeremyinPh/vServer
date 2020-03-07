package v.pubg.lol.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import v.pubg.lol.core.Result;
import v.pubg.lol.core.ResultGenerator;
import v.pubg.lol.model.Tagsmap;
import v.pubg.lol.service.impl.TagsmapServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/tagsmap")
public class TagsmapController {

    @Autowired
    private TagsmapServiceImpl tagsmapService;

    @PostMapping("/add")
    public Result add(@RequestBody Tagsmap tagsmap) {
        tagsmapService.insert(tagsmap);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/list")
    public Result list() {
        List<Tagsmap> list = tagsmapService.getAll();
        return ResultGenerator.genSuccessResult(list);
    }
}
