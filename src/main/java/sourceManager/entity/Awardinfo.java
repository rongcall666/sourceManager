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
public class Awardinfo {
	private Integer awardinfoId;
	private String awardinfoName;
	private String awardinfoDetail;
	private String awardinfoPirture;
	private Date awardinfoTime;
	private Integer awardinfoActivity;
	private Awardlevel awardlevel;
	private Student student;
}
