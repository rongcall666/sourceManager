/**
 * 
 */
package sourceManager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sourceManager.entity.Student;
import sourceManager.mapper.StudentMapper;

/**
 * @author jrong
 *
 */
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private BanjiService banjiService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see sourceManager.service.StudentService#login(sourceManager.entity.Student)
	 */
	@Override
	public boolean login(Student student) {
		if (student != null && student.getStudentId() != null && student.getStudentPassword() != null) {
			if (null != studentMapper.findStudentByStudentIdAndStudentPassword(student.getStudentId(),
					student.getStudentPassword())) {
				return true;
			}
		}
		return false;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sourceManager.service.StudentService#getStudentInfoByStudent(java.lang.
	 * Integer)
	 */
	@Override
	public Student getStudentInfoByStudent(Integer studentId) {
		Optional<Student> optional = Optional.ofNullable(studentMapper.findStudentByStudentId(studentId));
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sourceManager.service.StudentService#getStudentInfoByBanji(java.lang.Integer)
	 */
	@Override
	public List<Student> getStudentInfoByBanji(Integer banjiId) {
		if (null != banjiService.findBanjiByBanjiId(banjiId)) {
			return studentMapper.findStudentByBanji(banjiService.findBanjiByBanjiId(banjiId));

		} else {
			return null;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sourceManager.service.StudentService#updatePassword(sourceManager.entity.
	 * Student)
	 */
	@Override
	public boolean updatePassword(Student student) {

		return false;
	}

}
