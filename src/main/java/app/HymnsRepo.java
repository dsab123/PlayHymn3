package app;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class HymnsRepo {

	private HashMap<Integer, Hymn> repo;
	
	public HymnsRepo(HashMap<Integer, Hymn> repoIn) {
		repo = repoIn;

		addDefaultHymns();
	}
	
	public HymnsRepo() {
		repo = new HashMap<Integer, Hymn>();
		
		addDefaultHymns();
	}
	
//	@Bean
//	public HymnsRepo getHymnsRepo() {
//		return this;
//	}
	
	public void addHymn(Hymn hymn) {
		repo.put(hymn.getNumber(), hymn);
	}
	
	public void addDefaultHymns() {
		repo.put(1, new Hymn("How Great Thou Art", "Oh Lord my God...", 1));
		repo.put(2, new Hymn("Sweet Hour Of Prayer", "Sweet hour of prayer...", 2));
		repo.put(3, new Hymn("The Lord Will Provide", "When troubles assail...", 3));
		repo.put(4, new Hymn("The Sands Of Time Are Sinking", "Oh Christ, He is the Fountain...", 4));
	}
	
	public Hymn getHymn(int idNum) {
		// return error!
		return repo.get(idNum);
	}
}
