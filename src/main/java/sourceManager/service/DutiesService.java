/**
 * 
 */
package sourceManager.service;

import java.util.List;

import sourceManager.entity.Duties;

/**
 * @author jrong
 *
 */
public interface DutiesService {
	boolean addDuties(Duties duties);

	boolean updateDuties(Duties duties);

	boolean deleteDuties(Duties duties);

	List<Duties> findAllDuties();

	Duties findDutiesByDutiesId(Integer dutiesId);
}
