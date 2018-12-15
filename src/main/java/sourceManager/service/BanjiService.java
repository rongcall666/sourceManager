/**
 * 
 */
package sourceManager.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import sourceManager.entity.Banji;

/**
 * @author jrong
 *
 */
public interface BanjiService {
	boolean addBanji(Banji banji);

	boolean deleteBanji(Integer banjiId);

	boolean updateBanji(Banji banji);

	List<Banji> findAllBanji();

	List<Banji> findBanjiByCollegeId(Integer collegeId);

	Banji findBanjiByBanjiId(Integer banjiId);
}
