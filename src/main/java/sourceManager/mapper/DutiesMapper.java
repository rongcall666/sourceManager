/**
 * 
 */
package sourceManager.mapper;

import java.util.List;

import sourceManager.entity.Duties;

/**
 * @author jrong
 *
 */
public interface DutiesMapper {
	void addDuties(Duties duties);
	
	void updateDuties(Duties duties);
	
	void deleteDuties(Duties duties);
	
	List<Duties> findAllDuties();
	
	Duties findDutiesByDutiesId(Integer dutiesId);
}
