package ec.dev.samagua.commons_models.controllers_models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ControllerResultErrorDetail {
    private String code;
    private String field;
    private String message;
    private String value;
}
