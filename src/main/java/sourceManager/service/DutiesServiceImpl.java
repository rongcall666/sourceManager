/**
 * 
 */
package sourceManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sourceManager.entity.Duties;
import sourceManager.mapper.DutiesMapper;

/**
 * @author jrong
 *
 */
@Service
public class DutiesServiceImpl implements DutiesService {

	@Autowired
	private DutiesMapper dutiesMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sourceManager.service.DutiesService#addDuties(sourceManager.entity.Duties)
	 */
	@Override
	public boolean addDuties(Duties duties) {
		if (duties != null && duties.getDutiesId() != null && duties.getDutiesName() != null) {
			dutiesMapper.addDuties(duties);
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sourceManager.service.DutiesService#updateDuties(sourceManager.entity.Duties)
	 */
	@Override
	public boolean updateDuties(Duties duties) {
		if (duties != null && duties.getDutiesId() != null && duties.getDutiesName() != null) {
			dutiesMapper.updateDuties(duties);
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sourceManager.service.DutiesService#deleteDuties(sourceManager.entity.Duties)
	 */
	@Override
	public boolean deleteDuties(Duties duties) {
		if (duties != null && duties.getDutiesId() != null) {
			dutiesMapper.deleteDuties(duties);
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sourceManager.service.DutiesService#findAllDuties()
	 */
	@Override
	public List<Duties> findAllDuties() {
		return dutiesMapper.findAllDuties();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sourceManager.service.DutiesService#findDutiesByDutiesId(java.lang.Integer)
	 */
	@Override
	public Duties findDutiesByDutiesId(Integer dutiesId) {
		return dutiesMapper.findDutiesByDutiesId(dutiesId);
	}

}
