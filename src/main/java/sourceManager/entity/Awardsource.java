/**
 * 
 */
package sourceManager.entity;

import java.util.Date;
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
public class Awardsource {
	private Integer awardsourceId;
	private String awardsourceName;
	private Date awardsourceTime;
	private Awardlevel awardlevel;
}
