package ra.demo_joincolumn.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @Column(name = "cate_id")
    private String cateId;
    @Column(name = "cate_name")
    private String cateName;
    @Column(name = "status")
    private Boolean status;

    @OneToMany(mappedBy = "cate",fetch = FetchType.EAGER)
    private Set<Product> products;
}
