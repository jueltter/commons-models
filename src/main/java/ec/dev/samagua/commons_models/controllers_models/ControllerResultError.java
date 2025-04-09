package ec.dev.samagua.commons_models.controllers_models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ControllerResultError {
    private String code;
    private String message;
    private List<ControllerResultErrorDetail> details;
}
