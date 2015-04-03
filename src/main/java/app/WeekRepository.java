package app;

import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.*;
import org.springframework.data.repository.*;


public interface WeekRepository extends Repository<Week, Integer> {

	Page<Week> findAll(Pageable pageable);

	Week findWeekByDate(String date);
	
	List<Week> findAll();
}
