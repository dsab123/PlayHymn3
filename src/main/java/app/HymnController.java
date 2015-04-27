package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


@RestController
@Configuration
@RequestMapping("/hymn")
public class HymnController {
	HymnRepository repo;
	
	@RequestMapping(value="/{idNum}", method=RequestMethod.GET)
	public ResponseEntity<?> returnHymn(@PathVariable int idNum) {
		Hymn hymn = repo.findHymnByNumber(idNum);
		HttpStatus status = hymn != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		return new ResponseEntity<Hymn>(hymn, status);
	}
	
	@Autowired
	public void setHymnRepository(HymnRepository repoIn) {
		repo = repoIn;
	}
}
