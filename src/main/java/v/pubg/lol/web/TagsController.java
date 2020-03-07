package v.pubg.lol.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import v.pubg.lol.core.Result;
import v.pubg.lol.core.ResultGenerator;
import v.pubg.lol.model.Tags;
import v.pubg.lol.service.TagsService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/07.
 */
@RestController
@RequestMapping("/tags")
public class TagsController {
    @Resource
    private TagsService tagsService;

    @PostMapping("/add")
    public Result add(Tags tags) {
        tagsService.save(tags);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tagsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Tags tags) {
        tagsService.update(tags);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Tags tags = tagsService.findById(id);
        return ResultGenerator.genSuccessResult(tags);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Tags> list = tagsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
