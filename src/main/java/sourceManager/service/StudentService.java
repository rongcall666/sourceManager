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
	 * 登录
	 * 
	 * @param student
	 * @return
	 */
	boolean login(Student student);

	/**
	 * 查找学生个人信息
	 * 
	 * @param student
	 * @return
	 */
	Student getStudentInfoByStudent(Integer studentId);

	/**
	 * 查找班级学生信息
	 * 
	 * @param student
	 * @return
	 */
	List<Student> getStudentInfoByBanji(Integer banjiId);

	/**
	 * 修改密码
	 * 
	 * @param student
	 * @return
	 */
	boolean updatePassword(Student student);
}
