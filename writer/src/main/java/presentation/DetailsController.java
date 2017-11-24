/**
 * 
 */
package presentation;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vo.ResponseVO;
import vo.Worker;

/**
 * @author WE43MM
 * 
 * This is a Spring boot REST Controller.
 *
 */
@RestController
public class DetailsController {

	@SuppressWarnings("unused")
	private static final String CODE = "JJKJK786786KLJ";
	
	@RequestMapping("/*.wrt")
	public ResponseVO getCode(){
		Worker worker = new Worker("P.K.Das",254584, new Date());
		ResponseVO response = new ResponseVO(worker);
		return response;
	}
}
