package IMTX2.Backend.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="address")
public class Address {
    @Id
    @Column(name="address_id")
    private int addressId;
    private String address;
    private String City;
    private String state;
    @Column(name="zip_code")
    private int zipCode;
    private String country;
    @OneToMany
    @JoinColumn(name = "email", referencedColumnName = "customerID")

    private Customer email;




}
