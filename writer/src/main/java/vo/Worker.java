/**
 * 
 */
package vo;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author WE43MM
 * This VO will be used to give JSON response to the output.
 *
 */
@Getter
@Setter
@RequiredArgsConstructor
public class Worker implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4563843362240740954L;

	@NotNull
	private final String employeeName;
	
	@NotNull
	private final int employeeId;
	
	@NotNull
	private final Date lastUpdateTimestamp;
}
