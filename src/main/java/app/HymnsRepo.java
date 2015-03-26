package app;

import java.util.HashMap;

import org.springframework.stereotype.Component;
import org.springframework.data.repository.CrudRepository;

@Component
public class HymnsRepo implements CrudRepository<Hymn, Integer> {

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
		repo.put(1, new Hymn("How Great Thou Art", "Oh Lord my God...", 1));
		repo.put(2, new Hymn("Sweet Hour Of Prayer", "Sweet hour of prayer...", 2));
		repo.put(3, new Hymn("The Lord Will Provide", "When troubles assail...", 3));
		repo.put(4, new Hymn("The Sands Of Time Are Sinking", "Oh Christ, He is the Fountain...", 4));
	}
	
	public Hymn getHymn(int idNum) {
		// return error!
		return repo.get(idNum);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Hymn arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Hymn> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Hymn> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Hymn> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hymn findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Hymn> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Hymn> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
