package app;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Configuration;

@RestController
@Configuration
@RequestMapping("/week")
public class WeekController {
	WeekRepository repo;
	
	@RequestMapping(value="/{week}", method=RequestMethod.GET) 
	public @ResponseBody Week returnWeek(@PathVariable String week) {
		return repo.findWeekByDate(week);
	}
	
	@Autowired
	public void setWeekRepository(WeekRepository repoIn) {
		repo = repoIn;
	}
	
	// eh..
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Week> returnAllWeeks() {
		return repo.findAll();
	}
}
