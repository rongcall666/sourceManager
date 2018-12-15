/**
 * 
 */
package sourceManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sourceManager.entity.Banji;
import sourceManager.mapper.BanjiMapper;

/**
 * @author jrong
 *
 */
public class BanjiServiceImpl implements BanjiService {

	@Autowired
	private BanjiMapper banjiMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see sourceManager.service.BanjiService#addBanji(sourceManager.entity.Banji)
	 */
	@Override
	public boolean addBanji(Banji banji) {
		if (banji != null && null != banji.getBanjiName() && null != banji.getCollege()) {
			banjiMapper.addBanji(banji);
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sourceManager.service.BanjiService#deleteBanji(java.lang.Integer)
	 */
	@Override
	public boolean deleteBanji(Integer banjiId) {
		if (null != banjiMapper.findBanjiByBanjiId(banjiId)) {
			banjiMapper.deleteBanji(banjiId);
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sourceManager.service.BanjiService#updateBanji(sourceManager.entity.Banji)
	 */
	@Override
	public boolean updateBanji(Banji banji) {
		if (null != banji && banji.getBanjiId() != null && banji.getBanjiName() != null) {
			banjiMapper.updateBanji(banji);
			return true;
		}
		return false;
	}

	@Override
	public List<Banji> findAllBanji() {
		return banjiMapper.findAllBanji();
	}

	@Override
	public List<Banji> findBanjiByCollegeId(Integer collegeId) {
		return banjiMapper.findBanjiByCollegeId(collegeId);
	}

	@Override
	public Banji findBanjiByBanjiId(Integer banjiId) {
		return banjiMapper.findBanjiByBanjiId(banjiId);
	}

}
