/**
 * 
 */
package sourceManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sourceManager.entity.College;
import sourceManager.mapper.CollegeMapper;

/**
 * @author jrong
 *
 */
@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	private CollegeMapper collegeMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sourceManager.service.CollegeService#addCollege(sourceManager.entity.College)
	 */
	@Override
	public boolean addCollege(College college) {
		if (null != college && college.getCollegeName() != null) {
			collegeMapper.addCollege(college);
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sourceManager.service.CollegeService#updateCollege(sourceManager.entity.
	 * College)
	 */
	@Override
	public boolean updateCollege(College college) {
		if (college != null && college.getCollegeName() != null && null != college.getCollegeId()) {
			collegeMapper.updateCollege(college);
			return true;
		}
		return false;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sourceManager.service.CollegeService#deleteCollege(java.lang.Integer)
	 */
	@Override
	public boolean deleteCollege(Integer collegeId) {
		collegeMapper.deleteCollege(collegeId);
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sourceManager.service.CollegeService#findAllCollege()
	 */
	@Override
	public List<College> findAllCollege() {
		return collegeMapper.findAllCollege();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sourceManager.service.CollegeService#findCollegeByCollege(java.lang.Integer)
	 */
	@Override
	public College findCollegeByCollege(Integer collegeId) {
		return collegeMapper.findCollegeByCollege(collegeId);
	}

}
