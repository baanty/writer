/**
 * 
 */
package vo;

import java.io.Serializable;

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
public class ResponseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4563843362240740954L;

	@NotNull
	private final Worker worker;
}
