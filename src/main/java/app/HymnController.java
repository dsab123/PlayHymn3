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
	HymnRepository repo;
	
	@RequestMapping(value="/{idNum}", method=RequestMethod.GET)
	public @ResponseBody Hymn returnHymn(@PathVariable int idNum) {
		return repo.findHymnByNumber(idNum);
	}
	
	@Autowired
	public void setHymnRepository(HymnRepository repoIn) {
		repo = repoIn;
	}
}
