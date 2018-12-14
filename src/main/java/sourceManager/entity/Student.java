/**
 * 
 */
package sourceManager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jrong
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private Integer studentId;
	private String studentName;
	private String studentPassword;
	private Duties duties;
	private Banji banji;
}
