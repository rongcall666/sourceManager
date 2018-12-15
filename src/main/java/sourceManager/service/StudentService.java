/**
 * 
 */
package sourceManager.service;

import java.util.List;

import sourceManager.entity.Student;

/**
 * @author jrong
 *
 */
public interface StudentService {

	/**
	 * ��¼
	 * 
	 * @param student
	 * @return
	 */
	boolean login(Student student);

	/**
	 * ����ѧ��������Ϣ
	 * 
	 * @param student
	 * @return
	 */
	Student getStudentInfoByStudent(Integer studentId);

	/**
	 * ���Ұ༶ѧ����Ϣ
	 * 
	 * @param student
	 * @return
	 */
	List<Student> getStudentInfoByBanji(Integer banjiId);

	/**
	 * �޸�����
	 * 
	 * @param student
	 * @return
	 */
	boolean updatePassword(Student student);
}
