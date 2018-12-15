/**
 * 
 */
package sourceManager.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import sourceManager.entity.Awardinfo;

/**
 * @author jrong
 *
 */
public interface AwardinfoService {
	boolean addAwardInfo(Awardinfo awardinfo);

	boolean updateAwardInfoName(Awardinfo awardinfo);

	boolean updateAwardInfoDetail(Awardinfo awardinfo);

	boolean deleteAwardInfo(Awardinfo awardinfo);

	boolean updateAwardinfoActivity(Awardinfo awardinfo);

	List<Awardinfo> findAwardinfoByStudentId(@Param("studentId") Integer studentId);

	List<Awardinfo> findAwardinfoByAwardlevelId(@Param("awardlevelId") Integer awardlevelId);
}
