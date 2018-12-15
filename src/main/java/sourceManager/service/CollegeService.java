/**
 * 
 */
package sourceManager.service;

import java.util.List;

import sourceManager.entity.College;

/**
 * @author jrong
 *
 */
public interface CollegeService {
	boolean addCollege(College college);

	boolean updateCollege(College college);

	boolean deleteCollege(Integer collegeId);

	List<College> findAllCollege();

	College findCollegeByCollege(Integer collegeId);
}
