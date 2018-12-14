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
public class Banji {
	private Integer banjiId;
	private String banjiName;
	private College college;
}
