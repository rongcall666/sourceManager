/**
 * 
 */
package sourceManager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import sourceManager.entity.Banji;

/**
 * @author jrong
 *
 */
public interface BanjiMapper {
	void addBanji(Banji banji);

	void deleteBanji(Integer banjiId);

	void updateBanji(Banji banji);

	List<Banji> findAllBanji();

	List<Banji> findBanjiByCollegeId(@Param("collegeId") Integer collegeId);

	Banji findBanjiByBanjiId(Integer banjiId);
}
