package ra.demo_joincolumn.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @Column(name = "pro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer proId;
    @Column(name = "pro_name")
    private String proName;
    @Column(name = "producer")
    private String producer;
    @Column(name = "year_making")
    private Integer yearMaking;
    @Column(name = "expire_date")
    private Date expireDate;
    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "cate_id",referencedColumnName = "cate_id")
    private Category cate;
}
