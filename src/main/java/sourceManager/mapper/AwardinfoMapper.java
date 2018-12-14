/**
 * 
 */
package sourceManager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import sourceManager.entity.Awardinfo;

/**
 * @author jrong
 *
 */
public interface AwardinfoMapper {
	void addAwardInfo(Awardinfo awardinfo);

	void updateAwardInfoName(Awardinfo awardinfo);

	void updateAwardInfoDetail(Awardinfo awardinfo);

	void deleteAwardInfo(Awardinfo awardinfo);

	void updateAwardinfoActivity(Awardinfo awardinfo);

	List<Awardinfo> findAwardinfoByStudentId(@Param("studentId") Integer studentId);

	List<Awardinfo> findAwardinfoByAwardlevelId(@Param("awardlevelId") Integer awardlevelId);
}
