/**
 * 
 */
package sourceManager.mapper;

import java.util.List;

import sourceManager.entity.Awardlevel;

/**
 * @author jrong
 *
 */
public interface AwardlevelMapper {
	void addAwardlevel(Awardlevel awardlevel);

	void deleteAwardlevel(Integer awardlevelId);

	void updateAwardlevel(Awardlevel awardlevel);
	
	List<Awardlevel> findAllAwardlevel();
	
	Awardlevel findAwardlevelByAwardlevelId(Integer awardlevelId);
}
