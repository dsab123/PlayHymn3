package app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Configuration;

@RestController
@Configuration
@RequestMapping("/hymn")
public class HymnController {
	HymnsRepo repo;
	
	@RequestMapping(value="/{idNum}", method=RequestMethod.GET)
	public @ResponseBody Hymn greeting(@PathVariable int idNum) {
		return repo.getHymn(idNum);
	}
	
	@Autowired
	public void setHymnsRepo(HymnsRepo repoIn) {
		repo = repoIn;
	}
}
