/**
 * 
 */
package sourceManager.mapper;

import java.util.List;

import sourceManager.entity.Banji;
import sourceManager.entity.Student;

/**
 * @author jrong
 *
 */
public interface StudentMapper {
	
	void addStudent(Student student);

	void updateStudentPassword(Student student);

	void updateStudentName(Student student);

	void updateDuties(Student student);

	void updateBanji(Student student);
	
	List<Student> findStudentByBanji(Banji banji);
	
	Student findStudentByStudentId(Integer studentId);
	
	Student findStudentByStudentIdAndStudentPassword(Integer studentId,String studentPassword);
}
