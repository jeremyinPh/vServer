package v.pubg.lol.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import v.pubg.lol.core.Result;
import v.pubg.lol.core.ResultGenerator;
import v.pubg.lol.model.Predicts;
import v.pubg.lol.service.PredictsService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/07.
 */
@RestController
@RequestMapping("/predicts")
public class PredictsController {
    @Resource
    private PredictsService predictsService;

    @PostMapping("/add")
    public Result add(Predicts predicts) {
        predictsService.save(predicts);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        predictsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Predicts predicts) {
        predictsService.update(predicts);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Predicts predicts = predictsService.findById(id);
        return ResultGenerator.genSuccessResult(predicts);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Predicts> list = predictsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
