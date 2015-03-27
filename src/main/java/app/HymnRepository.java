package app;

import org.springframework.data.domain.*;
import org.springframework.data.repository.*;

public interface HymnRepository extends Repository<Hymn, Integer> {

	Page<Hymn> findAll(Pageable pageable);
	
	Hymn findHymnByNumber(Integer number);
}
