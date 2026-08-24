package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table("cars")
public class car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "brand" ,nullable = false)
    private String brand;

    @Column(name ="name")
    private String name;

    @Column(name ="price")
    private BigDecimal price;

   @Column(name ="image_url")
    private String imageUrl;

}
