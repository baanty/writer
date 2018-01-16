package vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import annotation.NameValidator;
import annotation.NumericValidator;
import lombok.Data;

@Data
@NameValidator
@NumericValidator
public class RequestVO {

    @NotNull
    private final String name;
    
    @NotNull
    @Pattern(message = "Giin is not valid", regexp = "[A-Za-z0-9 && [^^oO]]{6}.[A-Za-z0-9 && [^^oO]]{5}.[A-Za-z0-9 && [^^oO]]{2}.[A-Za-z0-9 && [^^oO]]{3}")
    private final String giin;
    
}
