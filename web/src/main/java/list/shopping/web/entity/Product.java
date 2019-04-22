package list.shopping.web.entity;

import java.sql.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.*;

import lombok.Data;

@Data
@Entity
@Table(name = "product")
@JsonPropertyOrder({"id", "name", "status", "created_at", "updated_at"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty("id")
    private int id;

    @Column(name = "name")
    @JsonProperty("name")
    private String name;

    @Column(name = "status")
    @JsonProperty("status")
    private String status;

    @Column(name = "created_at")
    @JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @JsonProperty("updated_at")
    private Timestamp updatedAt;
}
