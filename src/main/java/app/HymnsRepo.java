/*
 * THIS CLASS WAS USED AS A TEMP DATABASE BEFORE SETTING UP HymnRepository
 * */

package app;

import java.util.HashMap;

import org.springframework.stereotype.Component;
//import org.springframework.data.repository.CrudRepository;

//@Component
public class HymnsRepo {//implements CrudRepository<Hymn, Integer> {

	private HashMap<Integer, Hymn> repo;

	public HymnsRepo(HashMap<Integer, Hymn> repoIn) {
		repo = repoIn;

		addDefaultHymns();
	}

	public HymnsRepo() {
		repo = new HashMap<Integer, Hymn>();

		addDefaultHymns();
	}

	public void addHymn(Hymn hymn) {
		repo.put(hymn.getNumber(), hymn);
	}

	public void addDefaultHymns() {
		/*		repo.put(1, new Hymn("How Great Thou Art", "Oh Lord my God...", 1));
		repo.put(2, new Hymn("Sweet Hour Of Prayer", "Sweet hour of prayer...", 2));
		repo.put(3, new Hymn("The Lord Will Provide", "When troubles assail...", 3));
		repo.put(4, new Hymn("The Sands Of Time Are Sinking", "Oh Christ, He is the Fountain...", 4));
		 */
	}

	public Hymn getHymn(int idNum) {
		// return error!
		return repo.get(idNum);
	}
}
