/**
 * 
 */
package sourceManager.mapper;

import java.util.List;

import sourceManager.entity.College;

/**
 * @author jrong
 *
 */
public interface CollegeMapper {
	void addCollege(College college);

	void updateCollege(College college);

	void deleteCollege(Integer collegeId);
	
	List<College> findAllCollege();
	
	College findCollegeByCollege(Integer collegeId);
}
