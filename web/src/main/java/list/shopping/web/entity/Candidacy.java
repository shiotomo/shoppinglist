package list.shopping.web.entity;

import java.sql.Timestamp;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "candidacy")
public class Candidacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "url")
    private String url;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}