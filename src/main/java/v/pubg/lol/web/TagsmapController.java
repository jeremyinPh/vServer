package v.pubg.lol.web;

/**
* Created by CodeGenerator on 2020/03/07.
*/
//@RestController
//@RequestMapping("/tagsmap")
public class TagsmapController {
    /*@Resource
    private TagsmapService tagsmapService;

    @PostMapping("/add")
    public Result add(Tagsmap tagsmap) {
        tagsmapService.save(tagsmap);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tagsmapService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Tagsmap tagsmap) {
        tagsmapService.update(tagsmap);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Tagsmap tagsmap = tagsmapService.findById(id);
        return ResultGenerator.genSuccessResult(tagsmap);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Tagsmap> list = tagsmapService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }*/
}
