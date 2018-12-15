/**
 * 
 */
package sourceManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sourceManager.entity.Awardinfo;
import sourceManager.mapper.AwardinfoMapper;

/**
 * @author jrong
 *
 */
@Service
public class AwardinfoServiceImpl implements AwardinfoService{
	
	@Autowired
	private AwardinfoMapper awardinfoMapper;
	
	/* (non-Javadoc)
	 * @see sourceManager.service.AwardinfoService#addAwardInfo(sourceManager.entity.Awardinfo)
	 */
	@Override
	public boolean addAwardInfo(Awardinfo awardinfo) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see sourceManager.service.AwardinfoService#updateAwardInfoName(sourceManager.entity.Awardinfo)
	 */
	@Override
	public boolean updateAwardInfoName(Awardinfo awardinfo) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see sourceManager.service.AwardinfoService#updateAwardInfoDetail(sourceManager.entity.Awardinfo)
	 */
	@Override
	public boolean updateAwardInfoDetail(Awardinfo awardinfo) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see sourceManager.service.AwardinfoService#deleteAwardInfo(sourceManager.entity.Awardinfo)
	 */
	@Override
	public boolean deleteAwardInfo(Awardinfo awardinfo) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see sourceManager.service.AwardinfoService#updateAwardinfoActivity(sourceManager.entity.Awardinfo)
	 */
	@Override
	public boolean updateAwardinfoActivity(Awardinfo awardinfo) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see sourceManager.service.AwardinfoService#findAwardinfoByStudentId(java.lang.Integer)
	 */
	@Override
	public List<Awardinfo> findAwardinfoByStudentId(Integer studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see sourceManager.service.AwardinfoService#findAwardinfoByAwardlevelId(java.lang.Integer)
	 */
	@Override
	public List<Awardinfo> findAwardinfoByAwardlevelId(Integer awardlevelId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
