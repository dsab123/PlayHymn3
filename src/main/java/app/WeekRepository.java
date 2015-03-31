package app;

import java.sql.Date;

import org.springframework.data.domain.*;
import org.springframework.data.repository.*;


public interface WeekRepository extends Repository<Week, Integer> {

	Page<Week> findAll(Pageable pageable);

	Week findWeekByDate(String date);
}
