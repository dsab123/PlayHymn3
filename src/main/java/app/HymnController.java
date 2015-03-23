package app;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HymnController {
	@RequestMapping("/greeting")
	public Hymn greeting(String name) {
		return new Hymn("a", "a", "a");
	}

	@RequestMapping("/goodbye")
	public Hymn goodbye(String name) {
		return new Hymn("a", "a", "a");
	}
}
