package v.pubg.lol.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import v.pubg.lol.core.Result;
import v.pubg.lol.core.ResultGenerator;
import v.pubg.lol.model.Events;
import v.pubg.lol.service.EventsService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/07.
 */
@RestController
@RequestMapping("/events")
public class EventsController {
    @Resource
    private EventsService eventsService;

    @PostMapping("/add")
    public Result add(Events events) {
        eventsService.save(events);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        eventsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Events events) {
        eventsService.update(events);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Events events = eventsService.findById(id);
        return ResultGenerator.genSuccessResult(events);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Events> list = eventsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
