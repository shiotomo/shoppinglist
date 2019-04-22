package list.shopping.web.model;

import com.fasterxml.jackson.annotation.*;

import lombok.Data;

@Data
@JsonPropertyOrder({"id", "name", "status", "created_at", "updated_at"})
public class CsvProductModel {
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("status")
    private String status;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;
}
