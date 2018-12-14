/**
 * 
 */
package sourceManager.mapper;

import java.util.List;

import sourceManager.entity.Awardsource;

/**
 * @author jrong
 *
 */
public interface AwardSourceMapper {
	void addAwardSource(Awardsource awardSource);

	void deleteAwardSource(Integer awardSourceId);

	void updateAwardSource(Awardsource awardSource);
	
	List<Awardsource> findAllAwardSource();
	
	Awardsource findAwardSourceByAwardSourceId(Integer awardSourceId);
}
